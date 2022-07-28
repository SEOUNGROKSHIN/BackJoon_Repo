import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (H != 0 && M <= 59 && H <= 23) {
            H--;
            M = 60 - (45 - M);
            System.out.printf("%d %d", H, M);
        }
      /*      if (H == 0 && M != 0) {
            H += 23;
            M = 60 - (45 - M);
            System.out.printf("%d %d", H, M);
        } else if (H == 0 && M == 45) {
            H += 23;
            M = 0;
            System.out.printf("%d %d", H, M);
        } else if (H == 0 && M <= 59) {
            H += 23;
            M = 60 - (45 - M);
            System.out.printf("%d %d", H, M);
        } */
    }
}

