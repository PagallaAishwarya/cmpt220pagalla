
package ASH;

/**
 *
 * @author aishw
 */
import java.util.Scanner;
public class ASH61 {
 
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //System.out.print(getPentagonalNumber(i) + (i %10 == 0? System.getProperty("line.separator") : "\t")); //advanced ;D
            System.out.print(getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
    }
 
    public static int getPentagonalNumber(int n) {
        return (3 * n * n - n) / 2;
    }
}
