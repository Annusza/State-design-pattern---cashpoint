

public class StanBankomatNieaktywny implements Stan {
	Bankomat bankomat;
	
	public StanBankomatNieaktywny(Bankomat bankomat) {	
		this.bankomat = bankomat;
	}

	@Override
	public void w³ó¿Kartê() {
		System.out.println("Karta przyjêta");
		bankomat.setStan(bankomat.getStanBankomatAktywnyPin());
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Nie w³o¿ono karty");
		
	}
	
	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Najpierw w³ó¿ kartê");
		
	}

	@Override
	public void porównajSejf() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Najpierw w³ó¿ kartê");
		
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Najpierw w³ó¿ kartê");
	}
	@Override
	public String toString() {
		return "Bankomat nieaktywny. W³ó¿ kartê";
	}
}
