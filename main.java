import java.util.Scanner;

public class main {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false; // Số nhỏ hơn 2 không phải nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Nếu chia hết thì không nguyên tố
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        int number = sc.nextInt();

        boolean result = isPrime(number);
        System.out.println("Kết quả: " + result);

        sc.close();
    }
}
