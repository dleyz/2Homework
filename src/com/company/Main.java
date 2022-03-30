package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int cat = 3;
        byte orange = 5;
        short dog = 4;
        long board = 365L;
        double orangeWeight = 5.5;
        float catWeight = 3.5f;
        boolean catIsAdult = cat>5;
        char c = 35;
        // Задание 2
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух боксеров " + totalWeight +" кг");
        double differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весом двух бойцов " + differenceWeight + " кг");
        //Задание 3
        byte bananas = 5;
        byte bananasWeight = 80;
        short totalBananasWeight = (short) (bananas * bananasWeight);
        byte milk = 2;
        byte milkWeight = 105;
        short totalMilkWeight = (short) (milk * milkWeight);
        byte icecream = 2;
        byte icecreamWeight = 100;
        short totalIcecreamWeight = (short) (icecream * icecreamWeight);
        byte egg = 4;
        byte eggWeight = 70;
        short totalEggWeight = (short) (egg * eggWeight);
        float breakfastWeightGr = (float) (totalBananasWeight + totalMilkWeight + totalIcecreamWeight + totalEggWeight);
        float breakfastWeightKg = (float) (breakfastWeightGr / 1000);
        System.out.println("Вес спорт-завтрака " + breakfastWeightKg + " кг");
        //Задание 4
        short lostWeightGr = 250;
        byte neededLostWeightKg = 7;
        short neededLostWeightGr = (short) (neededLostWeightKg * 1000);
        byte day = (byte) (neededLostWeightGr/lostWeightGr);
        System.out.println(day + " дней уйдет на похудение");
        lostWeightGr = 500;
        day = (byte) (neededLostWeightGr/lostWeightGr);
        System.out.println(day + " дней уйдет на похудение");
        byte mean = (14+28)/2;
        System.out.println(mean + "день в среднем понадобится");
        //Задание 5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashanew = (int) (masha * 1.1);
        int denisnew = (int) (denis * 1.1);
        int kristinanew = (int) (kristina * 1.1);
        int mashaDifference = (int) (mashanew * 12) - (masha * 12);
        int denisDifference = (int) (denisnew * 12) - (denis * 12);
        int kristinaDifference = (int) (kristinanew * 12) - (kristina * 12);
        System.out.println("Маша теперь получает" + mashanew + " рублей." + "Годовой доход вырос на" + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает" + denisnew + " рублей." + "Годовой доход вырос на" + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает" + kristinanew + " рублей." + "Годовой доход вырос на" + kristinaDifference + " рублей.");
    }
}
