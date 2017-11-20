public class Recursion {

    private int factorial(int n) {
        if (n == 1) return 1;               // Base case
        else return n * factorial(n-1);     // Reduction step
    }

    private int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    private Recursion(int n){
        System.out.println(factorial(n));
        System.out.println(fibonacci(n));        
    }

    public static void main(String[] args) {
        new Recursion(Integer.parseInt(args[0]));
    }
}