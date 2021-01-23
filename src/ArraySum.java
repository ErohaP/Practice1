class ArraySum extends Thread {
    int i;
    int n;
    int[][] arr;
    volatile int sum;
    public ArraySum(int i, int n, int[][] arr) {
        this.i = i;
        this.n = n;
        this.arr = arr;
        this.sum = 0;
    }
    synchronized void sum() {
        sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[i][j];
        }
    }
    @Override
    public void run() {
        for(int j=0;j<n;j++){
            sum();
        }
    }
}