public class FizzBuzz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=n; i++) {
            sb.setLength(0);
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            if (sb.toString().equals("") || sb == null) sb.append(i);
            System.out.println(sb.toString());
        }
    }
}