package ru.skypro;

import java.time.Instant;

public class Main {

    public static void leapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void OC(int clientDeviceYear, int clientOC) {
        if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOC == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOC == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOC == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void delivery(int deliveryDistance) {
        int deliveryDays = 1;
        if(deliveryDistance > 20) deliveryDays +=1;
        if(deliveryDistance > 60) deliveryDays +=1;
        if(deliveryDistance > 100) deliveryDays +=1;

        if (deliveryDays < 4) {
            System.out.println("Ваша карта будет доставлена в течении " + deliveryDays + " дня(ей)");
        } else {
            System.out.println("Мы не можем доставить карту на ваш адрес");
        }
    }

    public static void validator(String letters) {
        char[] arrayChars = letters.toCharArray();
        for(int i = 0; i < letters.length(); i++){
            if (arrayChars[i] == arrayChars[i + 1]) {
                System.out.println("Дубль найден: " + arrayChars[i]);
                break;
            } else {
                System.out.println("Дубль не найден");
                break;
            }

        }

    }

    public static void array(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }



    public static void main(String[] args) {
    task5();
    }

    public static void task1() {
        int year = 2021;
        leapYear(year);
    }

    public static void task2(){
        int currentYear = 2021;
        int clientOC = 1;
        OC(currentYear, clientOC);
    }

    public static void task3() {
        int deliveryDistance = 95;
        delivery(deliveryDistance);
    }

    public static void task4() {
        String letters = "abcdefghijk";
        validator(letters);

    }

    public static void task5() {
        int [] arr = {3, 2, 1, 6, 5};
        array(arr);
    }


}
