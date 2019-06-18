package ueb10.formen;

public class DreiecksPrisma extends Volumen{
	private double a;
	private double b;
	private double c;

	public DreiecksPrisma(double a, double b, double c, double h) {
     super(h);
     this.a = a;
     this.b = b;
     this.c = c;
	}

	@Override
	public double berechneGrundfläche() {
		return Math.sqrt(s()*(s()-a)*(s()-b)*(s()-c));
	}

	public double s(){
		return (a+b+c)/2;
	}

}
