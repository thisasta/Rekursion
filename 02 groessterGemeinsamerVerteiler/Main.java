public class Main {
    public int ggt(int zahl1, int zahl2){
        if (zahl2 != 0) {
            int rest = zahl1 % zahl2;
            return ggt(zahl2, rest);
        }
        return zahl1;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.ggt(9, 24));
    }
}
