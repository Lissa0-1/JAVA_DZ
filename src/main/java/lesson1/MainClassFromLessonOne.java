package lesson1;

import java.util.Scanner;
//1 задача. Программа которая выводит приветствие
public class MainClassFromLessonOne {
    public static void main(String[] args) {
        exOne ();
    }

    public static void exOne() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s%n", name);
        scanner.close();
    }
}

//2 задача. Массив двоичных чисел [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.