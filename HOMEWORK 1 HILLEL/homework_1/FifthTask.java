package homework_1;

import java.util.Scanner;

public class FifthTask {

    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);

    void enter() {
        System.out.println("Введите число :");
        int N = sc.nextInt();
        numbers(N);
    }

    int start = 2;

    void numbers(int N) {
        System.out.print("Простые чисто от одного до " + N + ": ");
        for (int i = 1; i <= N; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    prime = false;
            }
            if (prime)
                System.out.print(i + " ");
        }
    }


}
