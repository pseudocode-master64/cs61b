/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {
    /**
     * Determines the next number in the Collatz sequence
     */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else if (n % 2 == 1) {
            return 3 * n + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < 6; i++) {
            System.out.print(num + " ");
            num = nextNumber(num);
        }
    }
}
