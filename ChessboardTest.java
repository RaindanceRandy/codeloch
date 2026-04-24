public class ChessboardTest {

    public static int boo(int x, int y){
    int b = (x + y + 1) % 2;
    return b;
    }
    public static void main() {
        int n= 4;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col < n; col++)
                System.out.print(" " + boo(row, col));
            System.out.println(" " + boo(row, n))  ;
            }
    }
}
