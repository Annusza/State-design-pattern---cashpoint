
public class Bankomat {
	
	private Stan stanBankomatAktywnyPin = new StanBankomatAktywnyPin(this);		
	private Stan stanBankomatNieaktywny = new StanBankomatNieaktywny(this);
	private Stan stanBlokadaBankomatu = new StanBlokadaBankomatu(this);
	private Stan stanBlokadaKarty = new StanBlokadaKarty(this);
	private Stan stanBrakPodanejKwoty = new StanBrakPodanejKwoty(this);
	private Stan stanOczekiwanieNaKwotê = new StanOczekiwanieNaKwotê(this);
	private Stan stanBankomatWyp³ata = new StanBankomatWyp³ata(this);
	
	private Stan stan = stanBlokadaBankomatu;	
	int kwota = 0;						
	int wyp³ata;						
	
	
	
	public Bankomat(int kwotaSejf) {
		this.kwota = kwotaSejf;
		if(kwotaSejf > 0) {
			stan = stanBankomatNieaktywny;
		}
	}
	
	public void w³ó¿Kartê() {						
		stan.w³ó¿Kartê();
	}
	
	public void zwróæKartê() {
		stan.zwróæKartê();
	}
	
	public void dzia³aniePin(String dzia³aniePin) {
		stan.dzia³aniePin( dzia³aniePin);
	}
	
	public void wpiszKwotê(int ileKasy) {
		stan.wpiszKwotê(ileKasy);
		stan.porównajSejf();		
//		if (kwota > 0) {
//			kwota = kwota - wyp³ata;	
//		}								
	}
	
	public void wyp³aæKwotê() {
		stan.wyp³aæKwotê();
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

	public Stan getStanOczekiwanieNaKwotê() {
		return stanOczekiwanieNaKwotê;
	}

	public void setStanOczekiwanieNaKwotê(Stan stanOczekiwanieNaKwotê) {
		this.stanOczekiwanieNaKwotê = stanOczekiwanieNaKwotê;
	}
	

	public Stan getStanBankomatWyp³ata() {
		return stanBankomatWyp³ata;
	}

	public void setStanBankomatWyp³ata(Stan stanBankomatWyp³ata) {
		this.stanBankomatWyp³ata = stanBankomatWyp³ata;
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

	public int getWyp³ata() {
		return wyp³ata;
	}

	public void setWyp³ata(int wyp³ata) {
		this.wyp³ata = wyp³ata;
	}
	
}