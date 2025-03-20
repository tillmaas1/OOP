class Quadrat extends Form{
    private float seite;

    public Quadrat(float x,float y, float seite){
        super(x,y);
        this.seite=seite;
    }

    public static Quadrat ausFlaeche(float x,float y, float flaeche){
        float seite = (float) Math.sqrt(flaeche / 4);
        return new Quadrat(x, y, seite);
    }

    @Override
    public float berechneFlaeche(){
        return seite*seite;
    }

    public void Ausgabe(){
        System.out.println("Quadrat Eigenschaften:");
        System.out.printf("Seitenlänge: %.2f",seite);
        System.out.println();
        System.out.printf("Flächeninhalt: %.2f cm²",berechneFlaeche());
        System.out.println();
        System.out.printf("Koordinaten: (%d,%d)",(int)super.position.getX(),(int)super.position.getY());
        System.out.println();
    }
}
