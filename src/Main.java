public class Main {
    public static void main(String[] args) {
        Rechteck r=new Rechteck(1,2,2,2);
        Quadrat q=new Quadrat(1,3,2);
        Kreis k=new Kreis(1,4,2,2);

        r.Ausgabe();
        System.out.println("\n");
        q.Ausgabe();
        System.out.println("\n");
        k.Ausgabe();
    }
}