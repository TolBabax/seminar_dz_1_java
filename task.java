package seminar_java.seminar_dz_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2. Вывести все простые числа от 1 до 1000
3. Реализовать простой калькулятор
4. * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 
2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. */
public class task {
    public static void main(String[] args) {
        //  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n):
        /* int n = number_n();
        System.out.printf("Сумма чисел от 1 до n: %d \n", summa_n(n));
        System.out.printf("Произведение чисел от 1 до n: %d \n", multi_n(n)); */
        // 2. Вывести все простые числа от 1 до 1000
        /* prime_number(1000); */
        // 3. Реализовать простой калькулятор
        menu_calculator();
    }

    // Ввод числа n с консоли
    public static int number_n() {
        String encoding = System.getProperty("console.encoding", "cp866"); 
        Scanner iScaner = new Scanner(System.in, encoding);                          
        System.out.print("Введите число n: ");
        int number_n = iScaner.nextInt();
        // System.out.println(number_n);
        iScaner.close();
        return number_n;
    }

    // сумма чисел от 1 до n
    public static int summa_n(int n) {
        int summa = 0;
        for (int i = 1; i < n + 1; i++) {
            summa += i;
        }
        return summa;
    }
    // произведение чисел от 1 до n
    public static int multi_n(int n) {
        int multi = 1;
        for (int i = 1; i < n + 1; i++) {
            multi *= i;
        }
        return multi;
    }

    // Определение простых чисел
    public static void prime_number(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean prime_number = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime_number = false;
                    break;
                }
            }
            if (prime_number) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
    // меню калькулятора
    public static void menu_calculator() {
        while (true) {
            System.out.println("Добро пожаловать в калькулятор!");
            String encoding = System.getProperty("console.encoding", "cp866"); 
            Scanner iScaner = new Scanner(System.in, encoding);                          
            System.out.print("Введите первое число: ");
            int number_1 = iScaner.nextInt();
            System.out.print("Введите первое число: ");
            int number_2 = iScaner.nextInt();        
            // System.out.println(number_n);
              
            System.out.println("1. Для операции сложение наберите: '1'.");
            System.out.println("2. Для операции вычитание наберите: '2'.");
            System.out.println("3. Для операции умножения наберите: '3'.");
            System.out.println("4. Для операции деления наберите: '4'.");
            System.out.println("5. Для выхода из калькулятора: '5'.");
            // System.out.println("5. Для выхода из калькулятора наберите: 'e'.");
                                   
            System.out.print("Наберите цифру от 1 до 5: ");
            int letter_menu = iScaner.nextInt();
            // iScaner.close();
            if(letter_menu == 1) {
                int summa_n = number_1 + number_2;
                System.out.printf("Сумма двух чисел %d и %d = %d", number_1, number_2, summa_n);
                System.out.println();
                System.out.println("===============");
                
            }
            if(letter_menu == 2) {
                int minus_n = number_1 - number_2;
                System.out.printf("Разница двух чисел %d и %d = %d", number_1, number_2, minus_n);
                System.out.println();
                System.out.println("===============");
                
            }
            if(letter_menu == 3) {
                int umnozenie = number_1 * number_2;
                System.out.printf("Произведение двух чисел %d и %d = %d", number_1, number_2, umnozenie);
                System.out.println();
                System.out.println("===============");
                
            }
            if(letter_menu == 4) {
                int delenie = number_1 / number_2;
                System.out.printf("Деление двух чисел %d и %d = %d", number_1, number_2, delenie);
                System.out.println();
                System.out.println("===============");
               
            }
            if(letter_menu == 5) {
                iScaner.close();
                break;
            }
        }     
    }
}

    


