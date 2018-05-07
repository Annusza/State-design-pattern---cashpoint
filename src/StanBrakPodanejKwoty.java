
public class StanBrakPodanejKwoty implements Stan {
	Bankomat bankomat;
	
	public StanBrakPodanejKwoty(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w��Kart�() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Karta zwr�cona");
		bankomat.setStan(bankomat.getStanBankomatNieaktywny());
	}

	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Operacja niedozwolona");		
	}

	@Override
	public void por�wnajSejf() {
		System.out.println("Operacja niedozwolona");		
	}

	@Override
	public void wyp�a�Kwot�() {								
		System.out.println("W bankomacie nie ma ��danej kwoty. Podaj inn�");		 
		bankomat.setStan(bankomat.getStanOczekiwanieNaKwot�());
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Operacja niedozwolona");	
	}
	
}
