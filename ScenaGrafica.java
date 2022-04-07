import java.util.ArrayList;

public class ScenaGrafica {

	/*
	 * public boolean adaugaFigura(Figura f) {
	 * 
	 * if ((nrFiguri + 1) >= 10) {
	 * System.out.println("Adugare esuata: scena grafica este plina "); return
	 * false; } scenaGrafica[nrFiguri] = f; nrFiguri++; return true;
	 * 
	 * }
	 */

	/*
	 * public boolean eliminaFigura(Figura f) { if (nrFiguri == 0) {
	 * System.out.println("Scena grafica nu contine nicio figura"); return false; }
	 * for (int i = 0; i < nrFiguri; i++) { if (scenaGrafica[i].equals(f)) { for
	 * (int j = i; j < (nrFiguri - 1); j++) { scenaGrafica[j] = scenaGrafica[j + 1];
	 * } nrFiguri--; return true;
	 * 
	 * }
	 * 
	 * } System.out.println("scena grafica nu contine figura cautata "); return
	 * false;
	 * 
	 * }
	 * 
	 * private int nrFiguri = 0;
	 * 
	 * private Figura[] scenaGrafica = new Figura[10];
	 * 
	 * public String toString() { String str = "Contine scena grafica: \n"; for (int
	 * i = 0; i < nrFiguri; i++) str += scenaGrafica[i] + "\n";
	 * 
	 * return str;
	 * 
	 * }
	 * 
	 * public String toString(Class c) { String str = "Contine scena grafica: \n";
	 * for (int i = 0; i < nrFiguri; i++) if (c.isInstance(scenaGrafica[i])) str +=
	 * scenaGrafica[i] + "\n";
	 * 
	 * return str; }
	 */
	private int nrFig = 0;
	static ArrayList<Figura> scenaGrafica = new ArrayList<Figura>(10);

	public static void main(String[] args) {

		Patrat p = new Patrat(Culoare.ALBASTRU, 5);
		Cerc c = new Cerc(Culoare.ROSU, 3);
		Triunghi t = new Triunghi(Culoare.VERDE, 9, 8, 6);

		scenaGrafica.add(p);
		scenaGrafica.add(c);
		scenaGrafica.add(t);

		System.out.println(scenaGrafica.toString());

		System.out.println(p.calculPerimetru());

		/*
		 * ScenaGrafica scena = new ScenaGrafica(); Figura f1 = new
		 * Patrat(Culoare.ALBASTRU, 5);
		 * 
		 * scena.adaugaFigura(f1); System.out.println(scena.toString(Figura.class));
		 */

	}

}
