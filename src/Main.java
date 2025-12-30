public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int years = 21;
        if (years >= 18) {
            System.out.println("Ты совершеннолетний");
        }else {
            System.out.println("Ты еще не совершеннолетний");
        }

        System.out.println("Задание №2");
        int temperature = -2;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задание №3");
        int score = 130;
        if (score >= 60) {
            System.out.println("Сбавь скорость а то будет штраф");
        }else {
            System.out.println("Молодец что соблюдаеш скоростной режим");
        }

        System.out.println("Задание №4");
        int age = 7;
        if (age >= 2  && age <= 6) {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в садик");
        }
        if (age >= 7  && age <= 17) {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в школу");
        }
        if (age >= 18  && age <= 24) {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в колледж");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить на работу");
        }

        System.out.println("Задание №5");
        int kid = 11;
        boolean pip = true;
        if (kid <= 5) {
            System.out.println("нельзя кататься ");
        }
        if (kid > 5 && kid <= 14){
            System.out.println("можно котаться в сопровождении взрослого");
        }
        if (kid > 14){
            System.out.println("можно кататься ");
        }

        System.out.println("Задание №6");
        int sedentary = 60;
        int standing = 102;
        int people = 34;
        if (people < sedentary){
            System.out.println("Есть сидячие места");
        }
        if (people >= sedentary && people < standing){
            System.out.println("Есть стоячие места");
        }
        if (people >= standing){
            System.out.println("В вагоне нет мест");
        }

        System.out.println("Задание №7");
        int one = 2;
        int two = 3;
        int three = 1;

        if (one >= two && one >= three){
            System.out.println("Число "+one+" больше чем "+two+" и "+three);
        }
        if (two >= one && two >= three){
            System.out.println("Число "+two+" больше чем "+one+" и "+three);
        }
        if (three >= one && three >= two){
            System.out.println("Число "+three+" больше чем "+one+" и "+two);
        }
    }
}