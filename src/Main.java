public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №2");
        for (int i = 10; i > 0; i--){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №3");
        for (int i = 0; i <= 16; i = i+2){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №4");
        for (int i = 10; i >= -10; i--){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №5");
        for (int i = 1904; i < 2097; i = i+4){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №6");
        for (int i = 7; i < 100; i = i+7){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №7");
        for (int i = 1; i < 1000; i = i*2){
            System.out.println("Итерация числа "+i);
        }

        System.out.println("Задание №8");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total + money;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей");
        }

        System.out.println("Задание №9");
        int money1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++){
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total1+" рублей");
        }

        System.out.println("Задание №10");
        int two = 2;
        int difference = 0;
        for (int i = 1; i <= 10; i++){
            difference = i*two;
            System.out.println(difference);
        }
    }
}