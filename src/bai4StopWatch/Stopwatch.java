package bai4StopWatch;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
        //phương thức System....: trả về thời gian của hệ thống theo milliseconds
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (endTime - startTime);
    }

    public void sort() {
        int[] ints = new int[100000];
        for (int i = 0; i < ints.length; i++) {
            //String.valueOf(): trả về giá trị nguyên thủy dạng String của biến
            //Integer.parseInt(): ép từ String về giá trị Integer
            ints[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        stopwatch.sort();
        stopwatch.stop();
        System.out.println("Thời gian chạy của phương thức sort là: " + stopwatch.getElapsedTime());
    }
}