public class EulerE {

    // Fakultätfunktion: nimmt (int nr) und gibt nr! als int zurück
    static int fak(int nr) {
        int product = 1;
        for (int i = 1; i <= nr; i++)
            product = i * product;
        return product;
    }

    public static void main() {
        int n = 5;
        double sum = 0.0;
        for (int i = 0; i <= n; i++)
            sum = sum + 1.0/fak(i);

        System.out.println(sum);
    }

}