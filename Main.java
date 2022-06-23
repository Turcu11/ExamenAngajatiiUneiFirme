
public class Main {

	public static void main(String[] args) {

		AngajatCuSalarFix Turcu = new AngajatCuSalarFix("Turcu", 2200);
		AngajatCuSalarFix Iosif = new AngajatCuSalarFix("Iosif", 2130);
		AngajatCuOra Andrei = new AngajatCuOra("Andrei", 180, 23);
		AngajatCuOra Victor = new AngajatCuOra("Victor", 186, 20);

		Firma business = new Firma("firma");

		business.angajeaza(Andrei);
		business.angajeaza(Turcu);
		business.angajeaza(Turcu);// nu permite duplicari
		business.angajeaza(Iosif);
		business.angajeaza(Victor);

		System.out.println("Salar mediu pe firma: " + business.salarMediu());

		System.out.println(Turcu.calculSalar());
		System.out.println(Andrei.calculSalar());
		Andrei.adaugaOre(20);
		Andrei.schimbaSalarPeOra(28);
		System.out.println(Andrei.calculSalar());

		System.out.println("Salar mediu pe firma: " + business.salarMediu());
	}

}
