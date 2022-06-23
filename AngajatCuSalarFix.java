
public class AngajatCuSalarFix extends Angajat {

	private double salar;

	public AngajatCuSalarFix(String nume, double salar) {
		super(nume);
		if (salar < 100)
			this.salar = 100;
		this.salar = salar;
	}

	@Override
	public double calculSalar() {
		return this.salar;
	}

	public double schimbaSalarFix(double noulSalar) {
		return this.salar = noulSalar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AngajatCuSalarFix other = (AngajatCuSalarFix) obj;
		if (Double.doubleToLongBits(salar) != Double.doubleToLongBits(other.salar))
			return false;
		return true;
	}

	public double getSalar() {
		return salar;
	}

}
