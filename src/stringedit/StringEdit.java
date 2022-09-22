/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringedit;

import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----strings in Java----");
        System.out.println("Enter a string");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        OUTER:
        do {
            System.out.print("Choose function number");
            System.out.println("0. Exit the programm");
            System.out.println("1. Output the amount of symbols");
            System.out.println("2. Output the amount of words");
            System.out.println("3. Find a word in a string");
            System.out.println("4. Replace the given word in a string");
            int number = scn.nextInt();
            switch (number) {
                case 0:
                    break OUTER;
                case 1:
                    System.out.println("You chose " + number);
                    System.out.println("The amount of symbols is:" + str.length());
                    break;
                case 2:
                    System.err.println("You chose " + number);
                    String[] words = str.split(" ");
                    System.err.println("The amount of words is " + words.length);
                    break;
                case 3:
                    System.err.println("You chose " + number);
                    System.err.println("The word is at index: ");
                case 4:
                    System.err.println("You chose " + number);
                    System.err.println("The updated string: \n" + str);
                default:
                    break;
            }
        }while(true);
    }
}
