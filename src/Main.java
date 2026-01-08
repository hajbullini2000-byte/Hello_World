public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int clientOs = 0 ;
        if (clientOs == 1 ){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOs == 0 ){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задание №2");
        int os = 1;
        int ears = 2017;
        if (os == 0 && ears < 2015){
            System.out.println("Установите облегченную версия для iOS по ссылке");
        }else if (os == 0 && ears > 2015){
            System.out.println("Установите версия для iOS по ссылке");
        }else if (os == 1 && ears < 2015){
            System.out.println("Установите облегченную версия для Android по ссылке");
        }else {
            System.out.println("Установите версия для Android по ссылке");
        }

        System.out.println("Задание №3");
        int year = 2024;
        if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0)){
            System.out.println(year + "год является весаосным");
        }else {
            System.out.println(year + " год не является весакосным");
        }

        System.out.println("Задание №4");
        int distant = 95;
        if (distant <= 20){
            System.out.println("Потребуется "+1+" день");
        }else if (distant > 20 && distant <= 60){
            System.out.println("Потребуется "+2+" день");
        }else if (distant > 60 && distant <= 100 ){
            System.out.println("Потребуется "+3+" день");
        }else {
            System.out.println("Доставки нету");
        }

        System.out.println("Задание №5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправилный номер месяца!");
        }
    }
}