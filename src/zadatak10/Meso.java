/**
 * 
 */
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Meso extends Proizvod{

	private String zivotinjskoPoreklo;

	public Meso() {
		super();
	}

	public Meso(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String zivotinjskoPoreklo) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.zivotinjskoPoreklo = zivotinjskoPoreklo;
	}

	public String getZivotinjskoPoreklo() {
		return zivotinjskoPoreklo;
	}

	public void setZivotinjskoPoreklo(String zivotinjskoPoreklo) {
		this.zivotinjskoPoreklo = zivotinjskoPoreklo;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", zivotinjsko poreklo: ").append(zivotinjskoPoreklo).append(". UKUPNA CENA PROIZVODA: ").append(getUkupnaCenaProizvoda()).toString();
	}

	@Override
	public double getUkupnaCenaProizvoda() {
		return this.getCenaProizvoda() * 1.08;
	}
}