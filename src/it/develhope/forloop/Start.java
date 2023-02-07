package it.develhope.forloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        System.out.println("-----------------Starting-------------------");

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25));
        for (Integer number: numbers)
        {System.out.print(number + " ");
        }
    }
}
