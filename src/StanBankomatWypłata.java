
public class StanBankomatWyp�ata implements Stan {
	Bankomat bankomat;
	
	public StanBankomatWyp�ata(Bankomat bankomat){
		this.bankomat = bankomat;
	}

	@Override
	public void w��Kart�() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Operacja niedozwolona"); 
	}

	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void por�wnajSejf() {
		if (bankomat.getKwota() == 0) {			// 
			System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
			bankomat.setStan(bankomat.getStanBlokadaBankomatu());
		} else if(bankomat.getKwota() > 0) {	
			
			bankomat.setStan(bankomat.getStanBankomatNieaktywny());
		}
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Operacja niedozwolona");
	}
	
	@Override
	public String toString() {
		return "Bankomat wyp�ata";
	}
}
