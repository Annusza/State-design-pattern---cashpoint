
public class StanOczekiwanieNaKwot� implements Stan {
	Bankomat bankomat;
	
	public StanOczekiwanieNaKwot�(Bankomat bankomat) {
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
		bankomat.setWyp�ata(ileKasy);                          						
		if(bankomat.getWyp�ata() <= bankomat.getKwota()) {	
		 System.out.println("Prosz� odebra� kart�.\nTrwa wyp�acanie pieni�dzy, prosz� czeka�");
		 
		 bankomat.setStan(bankomat.getStanBankomatWyp�ata());
		
		 int nowaKwota = bankomat.getKwota() - bankomat.getWyp�ata();
		 bankomat.setKwota(nowaKwota);	
		 
		 
		 } else if(bankomat.getWyp�ata() > bankomat.getKwota()) { 	
			System.out.println("W bankomacie nie ma wystarczaj�cej kwoty do wyp�aty. Prosz� poda� inn� kwot�");
			bankomat.setStan(bankomat.getStanOczekiwanieNaKwot�());
		}
	}

	@Override
	public void por�wnajSejf() {
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Operacja nieodzwolona");
	}
	
	@Override
	public String toString() {
		return "Je�eli chcesz wyp�aci� pieni�dze, wybierz [2]";
	}
}
