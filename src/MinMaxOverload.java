import java.util.Scanner;
public class MinMaxOverload {

    public static void main(String[] args) { // main method
        // ask the user to enter three values, num1, num2, num3
        Scanner newObj = new Scanner(System.in);
        System.out.println("Please input 3 numbers including at least one fraction");

        double num1 = newObj.nextDouble();
        double num2 = newObj.nextDouble();
        double num3 = newObj.nextDouble();


        System.out.println( "You've entered : ");
        System.out.println (num1 + " " + num2 + " " + num3);

        if((num1%1)==0){
            System.out.println("The first entry is a whole number");
        }
        else {
            System.out.println("The first entry is a fraction");
        }
        if((num2%1)==0){
            System.out.println("The first entry is a whole number");
        }
        else {
            System.out.println("The first entry is a fraction");
        }
        if((num3%1)==0){
            System.out.println("The first entry is a whole number");
        }
        else {
            System.out.println("The first entry is a fraction");
        }

        // call min method and print the lowest value
        System.out.println("The lowest number is " + minMethod(num1,num2,num3));
        System.out.println("The highest number is " + maxMethod(num1,num2,num3));
    }

    // find the min (lowest) number on this method
    static double minMethod(double a, double b, double c){
        double min = Math.min(a, b);
        if (c < min) {
            min = c;
        }
        System.out.println("This is overloaded method #1");
        return min;
    }

    static int minMethod(int a, int b, int c){
        int min = Math.min(a, b);
        if (c < min) {
            min = c;
        }
        System.out.println("This is overloaded method #2");
        return min;
    }
    // find the max (biggest) number on this method
    static double maxMethod(double a, double b, double c){
        double max = Math.max(a, b);
        if (c > max) {
            max = c;
        }
        System.out.println("This is overloaded method #3");
        return max;
    }

    static int maxMethod(int a, int b, int c){
        int max = Math.max(a, b);
        if (c > max) {
            max = c;
        }
        System.out.println("This is overloaded method #4");
        return max;
    }
}