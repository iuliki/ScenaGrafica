public enum Culoare {

	ROSU(1), ALBASTRU(2), VERDE(3), GALBEN(4);

	private final int cod;

	Culoare(int cod) {
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	public Culoare getCuloare(int cod) {
		switch (cod) {
		case 1:
			return Culoare.ROSU;
		case 2:
			return Culoare.ALBASTRU;
		case 3:
			return Culoare.VERDE;
		case 4:
			return Culoare.GALBEN;
		}
		return null;
	}

}