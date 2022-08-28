package ru.netology.sqr;

public class SQRService {
    public int FindSqrOfRange(int Min, int Max){

        int count = 0;

        for(int i = 10; i < 100; i++) {
            int sqr = i*i;
            if ((Min<sqr) && (sqr<Max)) {
                System.out.println("Найдено совпадение: " + sqr);
                count++;
            }
        }
        return count;
    }
}
