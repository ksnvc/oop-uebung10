package ueb10.formen;

public class Quader extends Volumen {
	private double a;
	private double b;
	public Quader(double a, double b, double h) {
     super(h);
     this.a = a;
     this.b = b;
	}

	@Override
	public double berechneGrundfläche() {
		return a*b;
	}
}
