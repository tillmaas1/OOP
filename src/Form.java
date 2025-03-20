abstract class Form {
    protected Punkt position;
    public Form(float x,float y){
        this.position=new Punkt(x,y);
    }

    public abstract float berechneFlaeche();

    public void Ausgabe() {
        System.out.printf("Form an Position (%.2f, %.2f), Fläche: %.2f cm²%n",
                position.getX(), position.getY(), berechneFlaeche());
    }
}
