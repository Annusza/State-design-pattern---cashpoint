import java.util.Scanner;

public class InterfaceU¿ytkownika {
	Bankomat bankomat;			
	
	private static final int POLECENIE_W£Ó¯_KARTÊ = 0;
	private static final int POLECENIE_ZWRÓÆ_KARTÊ = 1;
	private static final int POLECENIE_WPISZ_KWOTÊ = 2;
	private static final int POLECENIE_DZIA£ANIE_PIN = 5;
	private static final int KONIEC = -1;

	int aktualnePolecenie;
	

	Scanner sc = new Scanner(System.in);

	public InterfaceU¿ytkownika(Bankomat bankomat2) {
		this.bankomat = bankomat2;
	}
	

	/**
	 * Odbieranie polecenia i przekazywanie go dalej (w pêtli)
	 */
	public void wyœwietlajInterfejs() {
		System.out.println("<< Witaj w bankomacie Banku Szmallenium >>\n");

		while (true) {
			// wypisanie stanu bankomatu
			System.out.println("Stan bankomatu: " + bankomat.getStan());			// metoda niestatyczna wywo³ywana jest zawsze na obiekcie
			// wypisanie na konsolê dostepnych poleceñ
			wybórPolecenia();
			// u¿ytkownik  wybiera, z którego polecenia chce skorzystaæ (podaje jego nr)
			aktualnePolecenie = sc.nextInt();
			// bankomat wykonuje polecenie wskazane przez u¿ytkownika (wskazanego powy¿ej)
			dzia³anieBankomatu();
			// jeœli u¿ytkownik wybierze polecenie koniec, interface koñczy pracê
			if (aktualnePolecenie == KONIEC) {
				break;
			}
		}
	}

	private void wybórPolecenia() {
		System.out.println("W£Ó¯ KARTÊ " + POLECENIE_W£Ó¯_KARTÊ);
		System.out.println("ZWRÓÆ KARTÊ " + POLECENIE_ZWRÓÆ_KARTÊ);
		System.out.println("WPISZ KWOTÊ " + POLECENIE_WPISZ_KWOTÊ);
		System.out.println("PODAJ PIN " + POLECENIE_DZIA£ANIE_PIN);
		
	}
	private void dzia³anieBankomatu(){
		if(aktualnePolecenie == POLECENIE_W£Ó¯_KARTÊ){
			bankomat.w³ó¿Kartê();
		} else if (aktualnePolecenie == POLECENIE_ZWRÓÆ_KARTÊ){
			bankomat.zwróæKartê();
		} else if (aktualnePolecenie == POLECENIE_WPISZ_KWOTÊ){
			System.out.println("Podaj kwotê, któr¹ chcesz wyp³aciæ");
																			
			int podanaKwota = sc.nextInt();
			bankomat.wpiszKwotê(podanaKwota);
			
			
		} else if (aktualnePolecenie == POLECENIE_DZIA£ANIE_PIN) {
			System.out.println("Bankomat oczekuje na PIN\nPodaj PIN");
			int wpisanyPin = sc.nextInt();
			String pinS³owo = "" + wpisanyPin;
			bankomat.dzia³aniePin(pinS³owo);	
		}
	}
									

}
