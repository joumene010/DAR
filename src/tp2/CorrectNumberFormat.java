package tp2;

import java.util.Scanner;
public class CorrectNumberFormat {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
    try{
        //get input from console
        String line = scanner.nextLine();

        //convert it to number
        int num = Integer.parseInt(line);

        // todo print the answer based on the input

        System.out.println("It's a number :)");
    }
    catch(Exception e){

            System.out.println("It's not a number :(");
        }
    }
}
