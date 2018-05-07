
public class StanBlokadaBankomatu implements Stan {
	Bankomat bankomat;
	
	public StanBlokadaBankomatu(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w³ó¿Kartê() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void porównajSejf() {	  
		if (bankomat.getKwota() == 0) {
			System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
		} else if(bankomat.getKwota() > 0) {									
			bankomat.setStan(bankomat.getStanBankomatNieaktywny());
		}
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}
	
	@Override
	public String toString() {
		return "Blokada bankomatu";
	}
}
