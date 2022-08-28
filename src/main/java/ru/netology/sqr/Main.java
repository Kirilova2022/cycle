package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService sqrs = new SQRService();
        System.out.println("Количество совпадений:" + sqrs.FindSqrOfRange(200,300));

    }
}
