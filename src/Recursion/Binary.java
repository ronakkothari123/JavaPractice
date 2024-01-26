package Recursion;

public class Binary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(15));
    }

    public static int convertToBinary(int num){
        if(num == 1) return num;
        else {
            return num % 2 + 10 * convertToBinary(num / 2);
        }
    }
}
