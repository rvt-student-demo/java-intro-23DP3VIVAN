package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi vardu:");
        String name = scanner.nextLine();

        System.out.println("Ievadi uzvardu:");
        String surname = scanner.nextLine();

        System.out.println("Ievadi grupu:");
        String group = scanner.nextLine();

        System.out.println("Student :" + name + " " + surname + " " + group);

        // Komentārs
        // String name = "Vika";
        // int age = 20;
        // boolean isOnline = false;

        // System.out.println(name);

    }

}
