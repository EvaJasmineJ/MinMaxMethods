import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) { // main method
        // ask the user to enter three values, num1, num2, num3
        Scanner newObj = new Scanner(System.in);
        System.out.println("Please input 3 numbers");
        int num1 = newObj.nextInt();
        int num2 = newObj.nextInt();
        int num3 = newObj.nextInt();

        System.out.println( "You've entered : ");
        System.out.println (num1 + " " + num2 + " " + num3);

        // call min method and print the lowest value
        System.out.println("The lowest number is " + minMethod(num1,num2,num3));
        System.out.println("The highest number is " + maxMethod(num1,num2,num3));
    }

    // find the min (lowest) number on this method
    static int minMethod(int a, int b, int c){
        int min = 0;
        if (a < b) {
            min = a;
        }else min = b;
        if (c < min) {
            min = c;
        }
        return min;
    }
    // find the max (biggest) number on this method
    static int maxMethod(int a, int b, int c){
        int max = 0;
        if (a > b){
            max = a;
        }else max = b;
        if (c > max) {
            max = c;
        }
        return max;
    }
}


