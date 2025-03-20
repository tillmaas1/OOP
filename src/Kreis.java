class Kreis extends Form {
    private float radius;

    public Kreis(float x, float y, float radius) {
        super(x,y);
        this.radius=radius;
    }

    public static Kreis ausFlaeche(float x, float y, float flaeche) {
        float radius = (float) Math.sqrt(flaeche / (Math.PI * 2));
        return new Kreis(x, y, radius);
    }

    @Override
    public float berechneFlaeche() {
        return (float) (Math.PI * radius * radius);
    }

    public void Ausgabe(){
        System.out.println("Kreis Eigenschaften:");
        System.out.printf("Radius: %.2f",radius);
        System.out.println();
        System.out.printf("Flächeninhalt: %.2f cm²",berechneFlaeche());
        System.out.println();
        System.out.printf("Koordinaten Mittelpunkt: (%d,%d)",(int)super.position.getX(),(int)super.position.getY());
        System.out.println();
    }
}
