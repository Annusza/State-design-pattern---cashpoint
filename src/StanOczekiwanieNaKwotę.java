
public class StanOczekiwanieNaKwotê implements Stan {
	Bankomat bankomat;
	
	public StanOczekiwanieNaKwotê(Bankomat bankomat) {
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
		bankomat.setWyp³ata(ileKasy);                          						
		if(bankomat.getWyp³ata() <= bankomat.getKwota()) {	
		 System.out.println("Proszê odebraæ kartê.\nTrwa wyp³acanie pieniêdzy, proszê czekaæ");
		 
		 bankomat.setStan(bankomat.getStanBankomatWyp³ata());
		
		 int nowaKwota = bankomat.getKwota() - bankomat.getWyp³ata();
		 bankomat.setKwota(nowaKwota);	
		 
		 
		 } else if(bankomat.getWyp³ata() > bankomat.getKwota()) { 	
			System.out.println("W bankomacie nie ma wystarczaj¹cej kwoty do wyp³aty. Proszê podaæ inn¹ kwotê");
			bankomat.setStan(bankomat.getStanOczekiwanieNaKwotê());
		}
	}

	@Override
	public void porównajSejf() {
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Operacja nieodzwolona");
	}
	
	@Override
	public String toString() {
		return "Je¿eli chcesz wyp³aciæ pieni¹dze, wybierz [2]";
	}
}
