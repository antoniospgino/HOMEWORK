package homework_1;

public class FirstTask {
    // First task
    int[] int1 = new int[34];

    public void first() {
        int num = 102;
        for (int i = 0; i < int1.length; i++) {
            num = num - 3;
            int1[i] = num;
            if (int1[i] % 5 == 0) {
                int1[i] = 99999;
            }
        }

        for (int i = 0; i < int1.length; i++) {
            System.out.print(int1[i] + " ");
        }
    }
}
