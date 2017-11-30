import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class OccurrencesCounter {
    private ArrayList<Integer> numbers;
    private HashMap<Integer, Integer> occurences;
    
    private void  generateNumbers(int n) {
        numbers = new ArrayList<>(n); 
        Random r = new Random();
    
        int randomNumber;           
        for(int i = 0; i < n; i++) {
            randomNumber = r.nextInt(n);
            numbers.add(randomNumber);
            System.out.printf("%d ", randomNumber);
        }
        
        System.out.println();
    }

    private void occurrencesCounterAlgorithm() {
        occurences = new HashMap<>(numbers.size());
        for (int i: numbers) {
            if(occurences.containsKey(i)) {
                occurences.put(i, occurences.get(i) + 1);
            } else {
                occurences.put(i, 1);
            }
        }
    }

    private void print() {
        for(Map.Entry<Integer,Integer> entry: occurences.entrySet()) {
            System.out.printf("{%d = %d} ", entry.getKey(), entry.getValue());
        }
        System.out.println();
        
        /*
        Alt 1: System.out.println(occurences);
        
        Alt 2: 
        for (int i = 1; i < n; i++){
            if(occurences.get(i) != null){
                System.out.println(i + ": " + occurences.get(i));
            }
        }
        */
    }

    private OccurrencesCounter(int n) {
        generateNumbers(n);
        occurrencesCounterAlgorithm();
        print();
    }

    public static void main(String[] args) {
        new OccurrencesCounter(Integer.parseInt(args[0]));
    }
}