package com.dominguez.week1;
import java.util.Scanner;
public class Main {

    static double temp = 69;

    public static void main(String[] args) {
        userInput();

        while(temp > -460){
            temperatureConvertor();
            output();
            userInput();

        }
    }
    static void temperatureConvertor (){
        temp = (temp - 32)*5 / 9;
    }
    static void userInput (){
        Scanner input = new Scanner(System.in);
        System.out .println("Enter a fahrenheit value: ");
        temp = input.nextDouble();
    }
    static void output(){
        System.out.println(temp);
    }
}

