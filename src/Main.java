public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("dog = " + dog );
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789.0;
        System.out.println("paper = " + paper);

        var addition_dog = dog + 4;
        System.out.println("dog + 4 = addition_dog =  " + addition_dog);
        var addition_cat = cat + 4;
        System.out.println("cat + 4 = addition_cat = " + addition_cat);
        var addition_paper = paper + 4;
        System.out.println("paper + 4 = addition_paper = " + addition_paper);

        var subtraction_dog = addition_dog - 3.5;
        System.out.println("addition_dog - 3.5 = subtraction_dog = " + subtraction_dog);
        var subtraction_cat = addition_cat - 1.6;
        System.out.println("addition_cat - 1.6 = subtraction_cat = " + subtraction_cat);
        var subtraction_paper = addition_paper - 7639;
        System.out.println("addition_paper - 7639 = subtraction_paper = " + subtraction_paper);

        var friend = 19;
        System.out.println("переменная friend = " + friend);
        friend = friend + 2;
        System.out.println("переменная friend = " + friend);
        friend = friend / 7;
        System.out.println("переменная friend = " + friend);

        var frog = 3.5;
        System.out.println("переменная frog = " + frog);
        frog = frog * 10;
        System.out.println("переменная frog = " + frog);
        frog = frog / 3.5;
        System.out.println("переменная frog = " + frog);
        frog = frog + 4;
        System.out.println("переменная frog = " + frog);

        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var common = fighter1 + fighter2;
        System.out.println("Общий вес боксеров = " + common);
        var difference = fighter2 % fighter1;
        System.out.println("Разница между боксерами = " + difference + " кг");

        var time = 640;
        var time_work = 8;
        var workers = time / time_work;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var too_much_workers = 94;
        var new_time_work = time / too_much_workers;
        System.out.println("Если в компании работает 94 человек, то всего " + new_time_work + " часов работы может быть поделено каждому сотрудникаму");
    }
}