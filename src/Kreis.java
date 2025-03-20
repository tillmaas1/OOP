public class Kreis {
    private double radius;
    private Punkt mittelpunkt;

    public Kreis(double x, double y, double radius, double mittelpunkt) {
        this.radius = radius;
        this.mittelpunkt = new Punkt(x,y);
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    public void Ausgabe(){
        System.out.println("Kreis Informationen:");
        System.out.printf("Radius: %f\n",radius);
        System.out.println("Flächeninhalt: "+berechneFlaeche()+" Quadratzentimeter");
        System.out.printf("Koordinaten Mittelpunkt: (%d,%d)",(int)mittelpunkt.getX(),(int)mittelpunkt.getY());
    }
}
