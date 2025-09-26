import java.util.*;

public class MinimumFolds {
     
   // Function to count folds needed to reduce from start to required
    public static int countFolds(int start, int target) {
        int folds = 0;
        while (start > target) {
            start = (start + 1) / 2; // fold = folded in half
            folds++;
        }
        return folds;
    }

    public static int minMoves(int h, int w, int h1, int w1) {
        int foldsH = countFolds(h, h1); // folds needed for required height
        int foldsW = countFolds(w, w1); // folds needed for required width
        return foldsH + foldsW;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial height h: ");
        int h = sc.nextInt();
        System.out.print("Enter initial width w: ");
        int w = sc.nextInt();
        System.out.print("Enter final height h1: ");
        int h1 = sc.nextInt();
        System.out.print("Enter final width w1: ");
        int w1 = sc.nextInt();

        int result = minMoves(h, w, h1, w1);
        System.out.println("Minimum moves: " + result);
        sc.close();
    }
}
