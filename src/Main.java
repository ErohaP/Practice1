import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =scan.nextInt();
            }
        }
        int[] sumOfAnyColumn = new int[n];
        for (int i = 0; i < n; i++) {
            ArraySum thread = new ArraySum(i,n,arr);
            thread.sum();
            sumOfAnyColumn[i] = thread.sum;
            System.out.println(sumOfAnyColumn[i]);
        }
    }
}