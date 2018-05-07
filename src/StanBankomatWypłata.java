
public class StanBankomatWyp³ata implements Stan {
	Bankomat bankomat;
	
	public StanBankomatWyp³ata(Bankomat bankomat){
		this.bankomat = bankomat;
	}

	@Override
	public void w³ó¿Kartê() {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Operacja niedozwolona"); 
	}

	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Operacja niedozwolona");
		
	}

	@Override
	public void porównajSejf() {
		if (bankomat.getKwota() == 0) {			// 
			System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
			bankomat.setStan(bankomat.getStanBlokadaBankomatu());
		} else if(bankomat.getKwota() > 0) {	
			
			bankomat.setStan(bankomat.getStanBankomatNieaktywny());
		}
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Operacja niedozwolona");
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Operacja niedozwolona");
	}
	
	@Override
	public String toString() {
		return "Bankomat wyp³ata";
	}
}
