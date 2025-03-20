public class Rechteck {
    private Punkt ecke;
    private double breite,hoehe;

    public Rechteck(double x,double y, double breite, double hoehe){
        this.ecke=new Punkt(x,y);
        this.breite=breite;
        this.hoehe=hoehe;
    }

    public double berechneFlaeche(){
        return breite*hoehe;
    }

    public void Ausgabe(){
        System.out.println("Rechteck Informationen:");
        System.out.println("Breite: "+breite);
        System.out.println("Höhe: "+hoehe);
        System.out.println("Der Flächeninhalt: "+berechneFlaeche()+" cm²");
        System.out.printf("Die Koordinaten: (%d,%d)",(int)ecke.getX(),(int)ecke.getY());
    }
}
