class Rechteck extends Form{
    private float breite,hoehe;

    public Rechteck(float x,float y, float breite, float hoehe){
        super(x,y);
        this.breite=breite;
        this.hoehe=hoehe;

    }

    public static Rechteck ausFlaeche(float x,float y, float breite, float flaeche){
        float hoehe=flaeche/breite;
        return new Rechteck(x, y, breite, hoehe);
    }

    public float berechneFlaeche(){
        return breite*hoehe;
    }

    public void Ausgabe(){
        System.out.println("Rechteck Eigenschaften:");
        System.out.printf("Breite: %.2f",breite);
        System.out.println();
        System.out.printf("Höhe: %.2f",hoehe);
        System.out.println();
        System.out.printf("Der Flächeninhalt: %.2f cm²",berechneFlaeche());
        System.out.println();
        System.out.printf("Die Koordinaten: (%d,%d)",(int)super.position.getX(),(int)super.position.getY());
        System.out.println();
    }
}
