public class LargestNumber {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int largest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c; 

        // print format instead of line, you will learn to love it :D 
        System.out.printf("The largest number is: %d and %d \n", largest, largest);
    }
}