
public class StanBlokadaBankomatu implements Stan {
	Bankomat bankomat;
	
	public StanBlokadaBankomatu(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w��Kart�() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void por�wnajSejf() {	  
		if (bankomat.getKwota() == 0) {
			System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
		} else if(bankomat.getKwota() > 0) {									
			bankomat.setStan(bankomat.getStanBankomatNieaktywny());
		}
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Bankomat chwilowo nieczynny. Przepraszamy");
	}
	
	@Override
	public String toString() {
		return "Blokada bankomatu";
	}
}
