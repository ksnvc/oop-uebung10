package ueb10.formen;

public class Zylinder extends Volumen{
	private double r;
	public Zylinder(double r, double h) {
		super(h);
		this.r =r;
	}

	@Override
	public double berechneGrundfläche() {
		return Math.PI *r*r;
	}
}
