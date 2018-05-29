package homework_1;

public class ThirdTask {
    /*
    3. Написать метод.
        - Входящие параметры:
	Массив чисел типа int.
        - Результат:
	Среднее арифметическое массива.
     */

    double third(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        return sum / mas.length;
    }
}
