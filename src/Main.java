public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int firstFriday = 1;
        for (;firstFriday <=31 ;firstFriday = firstFriday + 7){
            System.out.println("Сегодня пятница "+firstFriday+" -е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание №2");
        int marathon = 42195;
        int start = 0;
        int result;
        for (; start <= 42195; start = start + 500){
            System.out.println(start);
            result = marathon - start;
            System.out.println("Держитесь! Осталось "+result+" метров");
        }
        System.out.println("Марафон завершён!");
        do {
            start = start + 500;
            result = marathon - start;
            System.out.println("Держитесь! Осталось "+result+" метров");
            System.out.println("пройдено"+start);
        } while (start < 42195);
        System.out.println("Марафон завершён!");

        System.out.println("Задание №3");
        int budget = 700;
        int day = 1;
        for (; budget >= 0; budget = budget-100){
            day++;
            if (day % 5 == 0){
                System.out.println("Сегодня парковка бесплатная");
                continue;
            }
            System.out.println("Осталось бюджета "+budget);
        }
        if (budget==0){
            System.out.println("Плоти нологи");
        }
        while (budget>=0){
            System.out.println("Осталось бюджета "+budget);
            budget = budget-100;
            day++;
            if (day %5 ==0){
                System.out.println("Сегодня парковка бесплатно");
                continue;
            }
            if (budget==0){
                System.out.println("Плоти нологи");
            }
        }
        System.out.println("Задание №4");
        int month = 0;
        int total = 0;
        while (total < 12000000){
            total = total + 15000;
            month++;
            if (month%6==0){
                total=total+total/142;
            }
            if(total == 12000000){
                System.out.println("Ты набрал нужную сумму");
                break;
            }
            System.out.println(total+" за "+month);
        }

        System.out.println("Задание №5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100){
            charge = charge+2;
            minute++;
            if (minute%10 ==0){
                overheats++;
                minute=minute+2;
                System.out.println("перегрев ");
            }
            if (overheats == 3){
                System.out.println("Зарядка прекращена. Текущий заряд "+charge+" %");
                break;
            }
            System.out.println("телефон заряжен на "+charge+" % за "+minute+" минут. Перезарядка "+overheats);
        }
    }
}