public class Quadrat {
    private Punkt ecke;
    private double seite;

    public Quadrat(double x,double y, double seite){
        this.ecke=new Punkt(x,y);
        this.seite=seite;
    }

    public double berechneFlaeche(){
        return seite*seite;
    }

    public void Ausgabe(){
        System.out.println("Quadrat Informationen:");
        System.out.println("Seitenlänge: "+seite);
        System.out.println("Flächeninhalt: "+berechneFlaeche()+" cm²");
        System.out.printf("Koordinaten: (%d,%d)",(int)ecke.getX(),(int)ecke.getY());
    }
}
