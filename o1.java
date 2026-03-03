import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}