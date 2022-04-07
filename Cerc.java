
public class Cerc extends Figura {

	private double r;

	public Cerc(Culoare culoare, double r) {
		super(culoare);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double calculPerimetru() {
		return Math.PI * r * 2;

	}

}
