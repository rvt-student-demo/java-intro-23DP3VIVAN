package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        // System.out.println("Ievadi vardu:");
        // String name = scanner.nextLine();

        // System.out.println("Ievadi uzvardu:");
        // String surname = scanner.nextLine();

        // System.out.println("Ievadi grupu:");
        // String group = scanner.nextLine();

        // System.out.println("Student :" + name + " " + surname + " " + group);

        // Komentārs
        // String name = "Vika";
        // int age = 20;
        // boolean isOnline = false;
        // System.out.println(name):

        // String valueAsString = "42";
        // int value = Integer.valueOf(valueAsString);
        // value = value + 20;
        // System.out.println(value);
        
        // System.out.println("Give speed:");
        // int input1 = Integer.valueOf(scanner.nextLine);
        // if (input1 > 120) {
        //    System.out.println("Speeding ricket!");
        // }

        System.out.println("Write numbers:");
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;
        
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
        
            if (input == -1) {
                System.out.println("Thx! Bye!");
            }
        
            if (input < 0) {
                invalidNumbers++;
                continue;
            }
        
            sum += input;
            validNumbers++;
        }

    }
}