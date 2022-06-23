
public class AngajatCuOra extends Angajat {

	private int oreLucrate;
	private double salarPerOra;

	public AngajatCuOra(String nume, int nrOreStabilite, double salarPerOra) {
		super(nume);
		this.oreLucrate = nrOreStabilite;
		this.salarPerOra = salarPerOra;
	}

	@Override
	public double calculSalar() {
		return this.oreLucrate * this.salarPerOra;
	}

	public int adaugaOre(int nrOre) {
		return this.oreLucrate += nrOre;
	}

	public double schimbaSalarPeOra(double noulSalar) {
		return this.salarPerOra = noulSalar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AngajatCuOra other = (AngajatCuOra) obj;
		if (oreLucrate != other.oreLucrate)
			return false;
		if (Double.doubleToLongBits(salarPerOra) != Double.doubleToLongBits(other.salarPerOra))
			return false;
		return true;
	}

	public int getOreLucrate() {
		return oreLucrate;
	}

	public double getSalarPerOra() {
		return salarPerOra;
	}

}
