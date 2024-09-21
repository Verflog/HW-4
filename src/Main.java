public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        System.out.println("Задача 2");
        int temperature = -20;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int age1 = 6;
        if (age1 < 1) {
            System.out.println("Неправильно указан возраст");
        }
        else if (age1 == 1) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему рано в детский сад");
        }
        else if (age1 >= 2 & age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему надо ходить в детский сад");
        }
        else if (age1 >= 7 & age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему надо ходить в школу");
        }
        else if (age1 >= 18 & age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
        }
        else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }
        System.out.println("Задача 5");
        int age2 = 15;
        if (age2 < 1) {
            System.out.println("Неправильно указан возраст");
        }
        else if (age2 >= 1 & age2 <= 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то он не может кататься на аттракционе");
        }
        else if (age2 >  5 & age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения");
        }
        System.out.println("Задача 6");
        byte totalPlaces = 102;
        byte sittingPlaces = 60;
        short peopleInTrain = 59;
        if (peopleInTrain < 0) {
            System.out.println("Неправильно указано количество человек");
        }
        else if (peopleInTrain >= 0 & peopleInTrain < sittingPlaces) {
            System.out.println("Количество людей в вагоне: " + peopleInTrain + ", есть сидячие места");
        }
        else if (peopleInTrain >= sittingPlaces & peopleInTrain < totalPlaces) {
            System.out.println("Количество людей в вагоне: " + peopleInTrain + ", остались только стоячие места");
        }
        else {
            System.out.println("Вагон переполнен");
        }
        System.out.println("Задача 7");
        int one = -10;
        int two = 0;
        int three = 10;
        if (one > two) {
            if (one > three) {
                System.out.println(one + " - наибольшее число");
            }
            else {
                System.out.println(three + " - наибольшее число");
            }
        }
        else {
            if (two > three) {
                System.out.println(two + " - наибольшее число");
            }
            else {
                System.out.println(three + " - наибольшее число");
            }
        }
    }
}