import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("입력하세요");

        Scanner scanner = new Scanner(System.in);
        int num;

        num = scanner.nextInt();

        execute(num);
    }

    public static void execute(int num) {
        long sum = 0;// 데이터 타입 주의!!

        for (int i = 1; i <= num; i++) {
            sum += (num / i) * i;
        }
        
        System.out.println(sum);
    }

}