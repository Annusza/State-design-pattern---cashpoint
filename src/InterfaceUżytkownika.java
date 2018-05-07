import java.util.Scanner;

public class InterfaceU�ytkownika {
	Bankomat bankomat;			
	
	private static final int POLECENIE_W�ӯ_KART� = 0;
	private static final int POLECENIE_ZWR��_KART� = 1;
	private static final int POLECENIE_WPISZ_KWOT� = 2;
	private static final int POLECENIE_DZIA�ANIE_PIN = 5;
	private static final int KONIEC = -1;

	int aktualnePolecenie;
	

	Scanner sc = new Scanner(System.in);

	public InterfaceU�ytkownika(Bankomat bankomat2) {
		this.bankomat = bankomat2;
	}
	

	/**
	 * Odbieranie polecenia i przekazywanie go dalej (w p�tli)
	 */
	public void wy�wietlajInterfejs() {
		System.out.println("<< Witaj w bankomacie Banku Szmallenium >>\n");

		while (true) {
			// wypisanie stanu bankomatu
			System.out.println("Stan bankomatu: " + bankomat.getStan());			// metoda niestatyczna wywo�ywana jest zawsze na obiekcie
			// wypisanie na konsol� dostepnych polece�
			wyb�rPolecenia();
			// u�ytkownik  wybiera, z kt�rego polecenia chce skorzysta� (podaje jego nr)
			aktualnePolecenie = sc.nextInt();
			// bankomat wykonuje polecenie wskazane przez u�ytkownika (wskazanego powy�ej)
			dzia�anieBankomatu();
			// je�li u�ytkownik wybierze polecenie koniec, interface ko�czy prac�
			if (aktualnePolecenie == KONIEC) {
				break;
			}
		}
	}

	private void wyb�rPolecenia() {
		System.out.println("W�ӯ KART� " + POLECENIE_W�ӯ_KART�);
		System.out.println("ZWR�� KART� " + POLECENIE_ZWR��_KART�);
		System.out.println("WPISZ KWOT� " + POLECENIE_WPISZ_KWOT�);
		System.out.println("PODAJ PIN " + POLECENIE_DZIA�ANIE_PIN);
		
	}
	private void dzia�anieBankomatu(){
		if(aktualnePolecenie == POLECENIE_W�ӯ_KART�){
			bankomat.w��Kart�();
		} else if (aktualnePolecenie == POLECENIE_ZWR��_KART�){
			bankomat.zwr��Kart�();
		} else if (aktualnePolecenie == POLECENIE_WPISZ_KWOT�){
			System.out.println("Podaj kwot�, kt�r� chcesz wyp�aci�");
																			
			int podanaKwota = sc.nextInt();
			bankomat.wpiszKwot�(podanaKwota);
			
			
		} else if (aktualnePolecenie == POLECENIE_DZIA�ANIE_PIN) {
			System.out.println("Bankomat oczekuje na PIN\nPodaj PIN");
			int wpisanyPin = sc.nextInt();
			String pinS�owo = "" + wpisanyPin;
			bankomat.dzia�aniePin(pinS�owo);	
		}
	}
									

}
