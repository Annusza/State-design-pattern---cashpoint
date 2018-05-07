
public class StanBankomatAktywnyPin implements Stan {
	Bankomat bankomat;
	
	private static final int PODEJSCIA_DO_PIN = 3;			
	private int próbyPin = 0;
	
	public StanBankomatAktywnyPin(Bankomat bankomat) {
		this.bankomat = bankomat;
	}
	
	@Override
	public void w³ó¿Kartê() {
		System.out.println("Karta jest ju¿ w³o¿ona");
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Karta zwrócona");
		bankomat.setStan(bankomat.getStanBankomatNieaktywny());
	}

	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Zanim cokolwiek zrobisz, podaj PIN");
	}

	@Override
	public void porównajSejf() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Zanim cokolwiek zrobisz, podaj PIN");
	}
	
	public static int getPODEJSCIA_DO_PIN() {
		return PODEJSCIA_DO_PIN;
		
	}

	@Override
	
	public void dzia³aniePin(String input) {
		if(input.equals("3333")) {
			próbyPin = 0;		// przywrócenie domyœlnej liczby wykorzystanych próbPin = 0
			System.out.println("PIN poprawny");
			bankomat.setStan(bankomat.getStanOczekiwanieNaKwotê());
		} else {
			System.out.println("PIN niepoprawny");
			próbyPin++;
			if(próbyPin == PODEJSCIA_DO_PIN) {
				System.out.println(PODEJSCIA_DO_PIN + " razy podano z³y PIN");
				System.out.println("Blokada karty. W celu odblokowania skontaktuj siê z bankiem");
				bankomat.setStan(bankomat.getStanBlokadaKarty());
			}
		}
	}
	
	@Override
	public String toString() {
		return "Aktywny. Wykorzystano " + próbyPin + " prób PIN";
	}
}
