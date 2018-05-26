package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        First Task
        1. Сформировать строку которая состоит из чисел от 100 до 0 которые кратные 3. Если число также кратно 5 то заменить его на слово test.
        Например: `99, 96, 93, test, 87...`.
         */
        FirstTask firstTask=new FirstTask();
        firstTask.first(); // вместо слова test у меня 99999, пока не могу сделать чтобы меняло на test

        //Second Task

        /*
        Third Task
        3. Написать метод.
            - Входящие параметры:
        Массив чисел типа int.
            - Результат:
        Среднее арифметическое массива.
         */
        ThirdTask thirdTask = new ThirdTask();
        System.out.println("Среднее арифметическое массива : "+thirdTask.third(firstTask.int1));



        /*
        Fifth Task
        5. Число `N` вводится с клавиатуры. Вывести все простые числа от 2 до `N`.
        Например при N=15: `2, 3, 5, 7, 11, 13`
         */
        FifthTask fifthTask = new FifthTask();
        System.out.println("Введите число N с клавиатуры :");
        fifthTask.enter();

        /*
        Sixth Task
        6. Создать массив/список на 100 елементов и заполнить его случайными числами от 0 до 99.
        Напишите методы:
        a) вернет минимальное значение массива.
        b) отсортирует массив от большему к меньшему.
        с) какое число встречается чаще всего.
         */
        SixthTask sixthTask = new SixthTask();
        System.out.println("Наполняем массив случайными числами.");
        sixthTask.add();
        sixthTask.print(sixthTask.mas);
        System.out.println("Сортируем массив от большего к меньшему.");
        sixthTask.sort(sixthTask.mas);
        sixthTask.print(sixthTask.mas);
        System.out.println("Выводим минимальное значение массива.");
        sixthTask.printMin(sixthTask.min);
        System.out.println("Выводим элемент массива который встречается чаще всего.");
        System.out.println(sixthTask.maxCountNumber(sixthTask.mas));

        /*
        Seventh Task
        7. Задан текстовый файл. Вывести сколько в нём:
        a) строк
        b) слов
        c) символов
         */


    }

}
