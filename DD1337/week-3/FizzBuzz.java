public class FizzBuzz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        String result;

        for (int i = 1; i <=n; i++) {

            result = "";  

            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            if (i % 7 == 0) result += "Pop";
            if (result.equals("")) result += "" + i;
            
            System.out.println(result);
            
        }
    }
}