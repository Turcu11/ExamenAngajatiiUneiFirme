import java.util.HashSet;

public class Firma {

	String numeFirma;

	HashSet<Angajat> listaAngajati = new HashSet<Angajat>();

	public boolean angajeaza(Angajat a) {
		return listaAngajati.add(a);
	}

	public double salarMediu() {
		if (listaAngajati.isEmpty()) {
			return 0;
		}
		double salarMediu = 0;
		for (Angajat a : listaAngajati) {
			salarMediu += a.calculSalar();
		}
		return salarMediu;
	}

	public Firma(String numeFirma) {
		this.numeFirma = numeFirma;
	}
}
