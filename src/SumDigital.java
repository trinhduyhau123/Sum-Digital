public class SumDigital {
    public static int sum(int n) {
        int tong =0;
        while (n > 0) {
            int sodu = n%10;
            n/=10;
            tong+=sodu;
        }
        return tong;
    }
    public static void main(String[] args) {
        int n = sum(378);
        System.out.println("Tổng số đó: " +n);
    }
}
