package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int lowerBound, int upperBound) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                return i;
            }
        }
        return -1;
    }
}