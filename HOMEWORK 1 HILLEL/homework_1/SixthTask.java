package homework_1;

public class SixthTask {
    int min;
    int[] mas = new int[100];

    void add() {
        for (int x = 0; x < mas.length; x++) {
            mas[x] = (int) (Math.random() * 100);
        }
    }

    void sort(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[i] > mas[j]) {
                    int tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
        min = mas[99];
    }

    void print(int[] mas) {
        for (int f = 0; f < mas.length; f++) {
            System.out.print(mas[f] + " ");
        }
        System.out.println();
    }

    void printMin(int min) {
        System.out.println(min);
    }

    int maxCountNumber(int[] mas) {
        int maxKey = 0;
        int maxCounts = 0;

        int[] counts = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            counts[mas[i]]++;
            if (maxCounts < counts[mas[i]]) {
                maxCounts = counts[mas[i]];
                maxKey = mas[i];
            }
        }
        return maxKey;
    }
}
