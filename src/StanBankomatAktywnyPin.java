
public class StanBankomatAktywnyPin implements Stan {
	Bankomat bankomat;
	
	private static final int PODEJSCIA_DO_PIN = 3;			
	private int pr�byPin = 0;
	
	public StanBankomatAktywnyPin(Bankomat bankomat) {
		this.bankomat = bankomat;
	}
	
	@Override
	public void w��Kart�() {
		System.out.println("Karta jest ju� w�o�ona");
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Karta zwr�cona");
		bankomat.setStan(bankomat.getStanBankomatNieaktywny());
	}

	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Zanim cokolwiek zrobisz, podaj PIN");
	}

	@Override
	public void por�wnajSejf() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Zanim cokolwiek zrobisz, podaj PIN");
	}
	
	public static int getPODEJSCIA_DO_PIN() {
		return PODEJSCIA_DO_PIN;
		
	}

	@Override
	
	public void dzia�aniePin(String input) {
		if(input.equals("3333")) {
			pr�byPin = 0;		// przywr�cenie domy�lnej liczby wykorzystanych pr�bPin = 0
			System.out.println("PIN poprawny");
			bankomat.setStan(bankomat.getStanOczekiwanieNaKwot�());
		} else {
			System.out.println("PIN niepoprawny");
			pr�byPin++;
			if(pr�byPin == PODEJSCIA_DO_PIN) {
				System.out.println(PODEJSCIA_DO_PIN + " razy podano z�y PIN");
				System.out.println("Blokada karty. W celu odblokowania skontaktuj si� z bankiem");
				bankomat.setStan(bankomat.getStanBlokadaKarty());
			}
		}
	}
	
	@Override
	public String toString() {
		return "Aktywny. Wykorzystano " + pr�byPin + " pr�b PIN";
	}
}
