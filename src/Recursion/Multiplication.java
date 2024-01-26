package Recursion;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println(multiply(72, 72));;
    }

    public static int multiply(int num1, int num2){
        if(num2 == 1) return num1;
        else return num1 + multiply(num1, num2 - 1);
    }
}
