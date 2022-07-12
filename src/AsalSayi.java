public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k <= i; k++) {
                if (i % k == 0 && k < i) {
                    break;
                }
                if (i == k) {
                    System.out.println(i);
                }
            }
        }
    }
}