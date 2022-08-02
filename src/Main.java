import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        //1시 ~ 23시 + 59분 이하
        if (H >= 1 && H <= 23 && M <= 59) {
            // 45분 미만 일경우 H - 1
            if (H >= 1 && H <= 23 && M <= 45) {
                H--;
                M = 60 - (45 - M);

                //1시 ~ 23시 + 45분 경우
                if (H >= 1 && H <= 23 && M == 60) {
                    H++;
                    M = 0;

                //45분 초과 일 경우 H -1 생략
                } if (M > 45) {
                    M = M - 45;
                }
                System.out.printf("%d %d", H, M);
            }

            // 0시 + 59분 이하
        } else if (H == 0 && M <= 59) {

            //45분 보다 작으면 23시로 변경
            if (M <= 45) {
                H += 23;
                M = 60 - (45 - M);
            }
            //45분인 경우
            if (M == 60) {
                H -= 23;
                M = 0;
                //45분 초과 0시로 고정
            } else if (M > 45) {
                M = M - 45;
            }

            System.out.printf("%d %d", H, M);
        }

    }

}