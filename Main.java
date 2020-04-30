package com.gmail.mybmcc22;

/**
 * Write a program which returns each digit of an integer.
 */
public class Main {

    public static void main(String[] args) {
        eachDigit(3945);
        eachDigit(394523);
    }

    static void eachDigit(int num) {
        int count = 0;
        int digit, temp;
        temp = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            System.out.println("Digit place" + count + " is: " + digit);
            temp = temp / 10;
            count--;
        }
    }
}
