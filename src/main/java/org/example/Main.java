package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        }

        if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }

        return false;



    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        }
        // Hiçbiri 13 ile 19 arasında değilse false döner
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            // Yaz mevsimindeysek, sıcaklık 25 ile 45 arasında olmalı
            return temp >= 25 && temp <= 45;
        } else {
            // Yaz mevsiminde değilsek, sıcaklık 25 ile 35 arasında olmalı
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        // Alan hesaplaması
        return width * height;
    }

    public static double area(double radius) {
        // Negatif değer kontrolü
        if (radius < 0) {
            return -1;
        }
        // Alan hesaplaması
        return radius * radius * Math.PI;
    }
}
