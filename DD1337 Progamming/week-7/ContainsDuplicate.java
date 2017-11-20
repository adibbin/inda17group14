import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

class ContainsDuplicate {
    private ArrayList<Integer> numbers;

    private void  generateNumbers(int n) {
        // If we set a size we don't need to worry about when the ArrayList grows
        numbers = new ArrayList<>(n); 
        Random r = new Random();

        /*
         Declare variable outside loop instead of declaring a new variable inside 
         the loop, now the garbage collector doesn't have to do our work.
        */
        int randomNumber;   
        
        for(int i = 0; i < n; i++) {
            randomNumber = r.nextInt(n);
            numbers.add(randomNumber);
            System.out.printf("%d ", randomNumber);
            // Same as System.out.print(randomNumber + " ");
        }

        System.out.println();
    }

    private boolean containsDuplicateAlgorithm(){
        HashSet<Integer> hs = new HashSet<>(numbers.size()); // See comment for ArrayList init
        for (int i: numbers) {
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
    }

    // Constructor
    private ContainsDuplicate(int n) {
        generateNumbers(n);
        System.out.println(containsDuplicateAlgorithm());
    }
   
    public static void main(String[] args) {
        new ContainsDuplicate(Integer.parseInt(args[0]));
    }
        
}