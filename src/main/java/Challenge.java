package main.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String algarism = "";
        char[] entry = in.nextLine().toCharArray();

        for (int i = 1; i < entry.length; i++) {
            if(entry[i] != ' ') {
                while (entry[i] != ',' && entry[i] != ']') {
                    algarism = algarism.concat(String.valueOf(entry[i]));
                    i++;
                }
                numbers.add(Integer.parseInt(algarism));
                algarism = "";
            }
        }

        Operations operations = new Operations(numbers);

        System.out.println("Minimum value: " + operations.getMinimum());
        System.out.println("Maximum value: " + operations.getMaximum());
        System.out.println("Number of elements in the sequence: " + operations.getSizeOfEntry());
        System.out.println("Average: " + operations.getAverage());

    }
}