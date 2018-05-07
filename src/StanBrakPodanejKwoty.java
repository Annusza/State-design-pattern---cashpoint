
public class StanBrakPodanejKwoty implements Stan {
	Bankomat bankomat;
	
	public StanBrakPodanejKwoty(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w³ó¿Kartê() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Karta zwrócona");
		bankomat.setStan(bankomat.getStanBankomatNieaktywny());
	}

	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Operacja niedozwolona");		
	}

	@Override
	public void porównajSejf() {
		System.out.println("Operacja niedozwolona");		
	}

	@Override
	public void wyp³aæKwotê() {								
		System.out.println("W bankomacie nie ma ¿¹danej kwoty. Podaj inn¹");		 
		bankomat.setStan(bankomat.getStanOczekiwanieNaKwotê());
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Operacja niedozwolona");	
	}
	
}
