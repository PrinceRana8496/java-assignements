//Write a program to read user input until user writes XDONE and then show the entered text by the user on command line

import java.util.*;
public class Question2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    StringBuilder userInput = new StringBuilder();
    String line;
    System.out.println("Enter text (type 'XDONE' to finish):");
    //Loop will run until user enter XDONE
    while (true) {
        line = scanner.nextLine();
        if (line.equals("XDONE")) {
            break;
        }
        //append user input of one line into StringBuilder
        userInput.append(line);
    }
    //output in one line
    System.out.println("You entered:" + userInput.toString());

}
}
