

public class StanBankomatNieaktywny implements Stan {
	Bankomat bankomat;
	
	public StanBankomatNieaktywny(Bankomat bankomat) {	
		this.bankomat = bankomat;
	}

	@Override
	public void w��Kart�() {
		System.out.println("Karta przyj�ta");
		bankomat.setStan(bankomat.getStanBankomatAktywnyPin());
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Nie w�o�ono karty");
		
	}
	
	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Najpierw w�� kart�");
		
	}

	@Override
	public void por�wnajSejf() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Najpierw w�� kart�");
		
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Najpierw w�� kart�");
	}
	@Override
	public String toString() {
		return "Bankomat nieaktywny. W�� kart�";
	}
}
