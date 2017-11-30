import java.util.ArrayList;
import java.util.Random;

class ContainsDuplicate {
    private Random r = new Random();
    private ArrayList<Integer> numbers;
    
    ContainsDuplicate(int n) {
        numbers = new ArrayList<Integer>(n);
        
        for (int i = 0; i < n; i++) numbers.add(r.nextInt(n));
        
        // Print out the numbers
        for (Integer nr: numbers) System.out.print(nr + " ");
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i) == numbers.get(j)) {
                    System.out.println("Duplicate of: " + numbers.get(i));
                    break; // Unecessary to continue loop after finding duplicate
                }
            }
        }

    }

    public static void main(String[] args) {
        // Takes input from the terminal and parse the String to an int
        int input = Integer.parseInt(args[0]);
        
        new ContainsDuplicate(input);
    }
}