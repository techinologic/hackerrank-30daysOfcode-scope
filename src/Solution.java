import java.util.Scanner;

class Difference {
    public int maximumDifference = 0;
    private int[] elements;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        // compute max difference
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                Math.abs(elements[i] - elements[j]);
                if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}