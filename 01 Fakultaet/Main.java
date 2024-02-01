public class Main {
    public long berechneFakultaet(long zahl) {
        if(zahl > 1){
            return zahl * berechneFakultaet(zahl-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.berechneFakultaet(5));
    }
}
