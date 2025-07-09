package javafundamentals;

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char code = scanner.next().toUpperCase().charAt(0);
        switch (code) {
            case 'R':
                System.out.println("Color Name: Red");
                break;
            case 'B':
                System.out.println("Color Name: Blue");
                break;
            case 'G':
                System.out.println("Color Name: Green");
                break;
            case 'O':
                System.out.println("Color Name: Orange");
                break;
            case 'Y':
                System.out.println("Color Name: Yellow");
                break;
            case 'W':
                System.out.println("Color Name: White");
                break;
            default:
                System.out.println("Invalid Code");
        }

        scanner.close();
    }
}