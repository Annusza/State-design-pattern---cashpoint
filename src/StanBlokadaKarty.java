
public class StanBlokadaKarty implements Stan {
	Bankomat bankomat;
	
	public StanBlokadaKarty(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w³ó¿Kartê() {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em banku");
		
	}

	@Override
	public void zwróæKartê() {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em banku");
		
	}

	@Override
	public void wpiszKwotê(int ileKasy) {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em bankuuu");
		
	}

	@Override
	public void porównajSejf() {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em bankuoo");
		
	}

	@Override
	public void wyp³aæKwotê() {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em banku");
		
	}

	@Override
	public void dzia³aniePin(String input) {
		System.out.println("Karta zablokowana. Skontaktuj siê z Oddzia³em banku");
		
	}
	@Override
	public String toString() {
		return "Karta zablokowana";
	}
}
