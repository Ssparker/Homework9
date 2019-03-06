package edu.dmacc.codedsm.homework9;

import java.util.ArrayList;
import java.util.Random;


public class RandomIntegerListGenerator {


    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "Fizzbuzz";

    public static void main(String[] args) {
        ArrayList<Integer> integers = generateIntegers(20);
        ArrayList<String> strings = new ArrayList<>(20);

        for (int i : integers) {
            if(i % 15 == 0){
                strings.add(FIZZBUZZ);
               // continue;//
                //System.out.println("Fizzbuzz");  use when printing sep
            }
                 else if(i % 3 == 0) {
                   strings.add(FIZZ);
               // continue;//
                //System.out.println("Fizz");
            }
                    else if(i % 5 == 0){
                       strings.add(BUZZ);
               // continue;//
                // System.out.println("Buzz");
             }
            strings.add("Number " + i + " is not fizzy");

        }
        System.out.println(strings);
    }

    public static ArrayList<Integer> generateIntegers(int size) {
        ArrayList<Integer> xs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));//0 and positive ints
        }
        return xs;
    }

}
