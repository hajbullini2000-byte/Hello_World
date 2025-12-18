public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var a = 6;
        var b = 3;
        var result = a + b;
        System.out.println("a + b = " + result);
        var result1 = a - b;
        System.out.println("a - b = " + result1);
        var result2 = a * b;
        System.out.println("a * b = " + result2);
        var result3 = a / b;
        System.out.println("a / b = " + result3);

        var lifting_capacity = 50;
        var stuff_weight = 20;
        var capacity_Left = lifting_capacity - stuff_weight;
        System.out.println("Ещё можно положить " + capacity_Left + "кг вещей");

        var apple_weight = 2;
        var orange_weight = 3;
        var fruit_weight = apple_weight + orange_weight;
        System.out.println("Общий вес фруктов " + fruit_weight + "кг");

        var meat_weight = 4;
        var water_weight = 5;
        var tomatoes_weight = 2;
        var cucumbers_weight = 2;
        var peppers_weight = 2;
        var zucchini_weight = 2;
        var vegetable_weight = tomatoes_weight + cucumbers_weight + peppers_weight + zucchini_weight;
        var products_weight = fruit_weight + vegetable_weight + meat_weight + water_weight;
        System.out.println("Общий вес продуктов " + products_weight + "кг!");

        var left_weight = lifting_capacity - stuff_weight - products_weight;
        System.out.println("место осталось " + left_weight + "кг");

        products_weight = products_weight * 2;
        System.out.println("Теперь вес продуктов " + products_weight);

        left_weight = lifting_capacity - stuff_weight - products_weight;
        System.out.println("теперь места осталось " + left_weight + " кг!");

        var over_load = (stuff_weight + products_weight) % lifting_capacity;
        System.out.println("Перегруз на " + over_load + " кг!");

        var products_in_one_car = products_weight / 2;
        System.out.println("Продуктов в одной машине теперь " + products_in_one_car + " кг!");
    }
}