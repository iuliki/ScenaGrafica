
public class Figura {

	private Culoare culoare;
	private String tipFigura;

	public Figura(Culoare culoare) {
		super();
		this.culoare = culoare;
		this.tipFigura = this.getClass().getName();
	}

	public double calculPerimetru() {
		return -1;
	}

	public Culoare getCuloare() {
		return culoare;
	}

	public void setCuloare(Culoare culoare) {
		this.culoare = culoare;
	}

	public String toString() {
		return this.getClass() + " de culoare:  " + getCuloare() + " si perimetru = " + calculPerimetru();
	}

	public boolean equals(Figura f) {
		if ((this.getClass().getName().equals(f.getClass().getName()))
				&& (this.calculPerimetru() == f.calculPerimetru()))
			return true;
		else
			return false;

	}

}
