public class IsPrime {

    public static boolean divisible(int p, int q) {
        boolean isit;
        isit = (p%q == 0);
        System.out.println("n = " + p + ", divisibility by " + q + " :" + isit);
        return isit;
    }

    public static void main() {
        int n = 49;
        boolean primality = true;
        for (int i = 2; i <= n/2; i++)
            primality = primality && !divisible(n,i);
        System.out.println(primality);
    }
}
