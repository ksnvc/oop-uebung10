package ueb10.formen;

public abstract class Volumen {
    private double höhe;

    public Volumen(double höhe){
        this.höhe = höhe;
    }

    abstract double berechneGrundfläche();

    public double volumen(){
       return berechneGrundfläche()*höhe;
    }
}
