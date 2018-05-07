
public class Bankomat {
	
	private Stan stanBankomatAktywnyPin = new StanBankomatAktywnyPin(this);		
	private Stan stanBankomatNieaktywny = new StanBankomatNieaktywny(this);
	private Stan stanBlokadaBankomatu = new StanBlokadaBankomatu(this);
	private Stan stanBlokadaKarty = new StanBlokadaKarty(this);
	private Stan stanBrakPodanejKwoty = new StanBrakPodanejKwoty(this);
	private Stan stanOczekiwanieNaKwot� = new StanOczekiwanieNaKwot�(this);
	private Stan stanBankomatWyp�ata = new StanBankomatWyp�ata(this);
	
	private Stan stan = stanBlokadaBankomatu;	
	int kwota = 0;						
	int wyp�ata;						
	
	
	
	public Bankomat(int kwotaSejf) {
		this.kwota = kwotaSejf;
		if(kwotaSejf > 0) {
			stan = stanBankomatNieaktywny;
		}
	}
	
	public void w��Kart�() {						
		stan.w��Kart�();
	}
	
	public void zwr��Kart�() {
		stan.zwr��Kart�();
	}
	
	public void dzia�aniePin(String dzia�aniePin) {
		stan.dzia�aniePin( dzia�aniePin);
	}
	
	public void wpiszKwot�(int ileKasy) {
		stan.wpiszKwot�(ileKasy);
		stan.por�wnajSejf();		
//		if (kwota > 0) {
//			kwota = kwota - wyp�ata;	
//		}								
	}
	
	public void wyp�a�Kwot�() {
		stan.wyp�a�Kwot�();
	}
	
	void ustawStan (Stan stan) {		
		this.stan = stan;
	}

	public Stan getStanBankomatAktywnyPin() {
		return stanBankomatAktywnyPin;
	}

	public void setStanBankomatAktywnyPin(Stan stanBankomatAktywnyPin) {
		this.stanBankomatAktywnyPin = stanBankomatAktywnyPin;
	}

	public Stan getStanBankomatNieaktywny() {
		return stanBankomatNieaktywny;
	}

	public void setStanBankomatNieaktywny(Stan stanBankomatNieaktywny) {
		this.stanBankomatNieaktywny = stanBankomatNieaktywny;
	}

	public Stan getStanBlokadaBankomatu() {
		return stanBlokadaBankomatu;
	}

	public void setStanBlokadaBankomatu(Stan stanBlokadaBankomatu) {
		this.stanBlokadaBankomatu = stanBlokadaBankomatu;
	}

	public Stan getStanBlokadaKarty() {
		return stanBlokadaKarty;
	}

	public void setStanBlokadaKarty(Stan stanBlokadaKarty) {
		this.stanBlokadaKarty = stanBlokadaKarty;
	}

	public Stan getStanBrakPodanejKwoty() {
		return stanBrakPodanejKwoty;
	}

	public void setStanBrakPodanejKwoty(Stan stanBrakPodanejKwoty) {
		this.stanBrakPodanejKwoty = stanBrakPodanejKwoty;
	}

	public Stan getStanOczekiwanieNaKwot�() {
		return stanOczekiwanieNaKwot�;
	}

	public void setStanOczekiwanieNaKwot�(Stan stanOczekiwanieNaKwot�) {
		this.stanOczekiwanieNaKwot� = stanOczekiwanieNaKwot�;
	}
	

	public Stan getStanBankomatWyp�ata() {
		return stanBankomatWyp�ata;
	}

	public void setStanBankomatWyp�ata(Stan stanBankomatWyp�ata) {
		this.stanBankomatWyp�ata = stanBankomatWyp�ata;
	}

	public Stan getStan() {
		return stan;
	}

	public void setStan(Stan stan) {
		this.stan = stan;
	}

	public int getKwota() {
		return kwota;
	}

	public void setKwota(int kwota) {
		this.kwota = kwota;
	}

	public int getWyp�ata() {
		return wyp�ata;
	}

	public void setWyp�ata(int wyp�ata) {
		this.wyp�ata = wyp�ata;
	}
	
}