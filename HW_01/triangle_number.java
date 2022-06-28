package HW_01;

import java.util.Scanner;

/**
 * main
 */
public class triangle_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("введите число ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("треугольное число для " + n +"-ого числа = " + triangle_num(n));
    }

    public static int triangle_num(int n) {
        int result = n*(n+1)/2;
        return result;        
    }
}