import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arrayOne = new int[3];
        for (int index = 0; index < arrayOne.length; index++){
            arrayOne[index] = index + 1;
            System.out.println(arrayOne[index]);
        }
        double[] arrayTwo = {1.57, 7.654, 9.986};
        for (double index : arrayTwo) {
            System.out.println(index);
        }
        double[] arrayThree = new double[5];
        for (int index = 0; index < arrayThree.length; index++) {
            arrayThree[index] = index + 1.5;
            System.out.println(arrayThree[index]);
        }
        System.out.println("=============================");
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(arrayOne)+" "+Arrays.toString(arrayTwo)+" "+Arrays.toString(arrayThree));

        System.out.println("=============================");
        System.out.println("Задание 3");
        int length = 0;
        for (int ignored : arrayOne) {
            length++;}
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]+", ");}

        for (double ignored : arrayTwo) {
            length++;}
        for (int a = length - 4; a >= 0; a--) {
            System.out.print(arrayTwo[a]+", ");
        }

        for (double ignored : arrayThree) {
            length++;}
        for (int i = length - 7; i >= 0; i--) {
            System.out.print(arrayThree[i]+", ");
        }
        System.out.println();

        System.out.println("=============================");
        System.out.println("Задание 4");
        boolean theOddElement = true;
        if (theOddElement){
            for (int i = 0; i < arrayOne.length; i++){
                if (arrayOne[i] % 2 != 0){
                    arrayOne[i]++;
                }System.out.print(arrayOne[i]+", ");
            }
        }
        System.out.println();
        //if (theOddElement){
        //    for (double i = 0; i < arrayTwo.length; i++){
        //        if (arrayTwo[i] % 2 != 0){
        //            arrayTwo[i]++;
        //        }System.out.print(arrayTwo[i]+", ");
        //    }
        //}
        //System.out.println();
        //if (theOddElement){
        //    for (double i = 0; i < arrayThree.length; i++){
        //        if (arrayThree[i] % 2 != 0){
        //            arrayThree[i]++;
        //        }System.out.print(arrayThree[i]+", ");
        //    }
        //}
        //System.out.println();
    }
}