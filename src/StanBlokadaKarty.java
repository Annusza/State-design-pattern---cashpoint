
public class StanBlokadaKarty implements Stan {
	Bankomat bankomat;
	
	public StanBlokadaKarty(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void w��Kart�() {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em banku");
		
	}

	@Override
	public void zwr��Kart�() {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em banku");
		
	}

	@Override
	public void wpiszKwot�(int ileKasy) {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em bankuuu");
		
	}

	@Override
	public void por�wnajSejf() {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em bankuoo");
		
	}

	@Override
	public void wyp�a�Kwot�() {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em banku");
		
	}

	@Override
	public void dzia�aniePin(String input) {
		System.out.println("Karta zablokowana. Skontaktuj si� z Oddzia�em banku");
		
	}
	@Override
	public String toString() {
		return "Karta zablokowana";
	}
}
