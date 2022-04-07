
public class Patrat extends Figura {

	private double l;

	public Patrat(Culoare culoare, double l) {
		super(culoare);
		this.l = l;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double calculPerimetru() {
		return 4 * l;
	}

}
