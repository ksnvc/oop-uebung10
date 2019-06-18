package ueb10.formen;

public class ZylindrischesRohr extends Zylinder{
	private double r1;
	private double r2;

	public ZylindrischesRohr(double r1, double r2, double h) {
      super(r1,h);
      this.r2=r2;
	}

	@Override
	public double berechneGrundfläche() {
		return super.berechneGrundfläche()-(r2*r2*Math.PI);
	}
}
