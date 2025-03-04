package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number){
        int realNumber = number;
        int reversedNumber = 0;

        // 10'a bölümünden kalanı al
        // reverseNumber'ı 10la carpıp son elemanı ekle
        // sonraki basamaklar için 10'a bölerek ilerle reverseNumber

        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return realNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number){
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number %i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number){
        if(number <0){
            return "Invalid Value";
        }
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String word = "";
        while(number >0) {

            int digit = number % 10;
            word = numbers[digit] + " " + word;
            number /= 10;
        }
        return word.trim();
    }
}
