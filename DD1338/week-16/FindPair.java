import java.util.HashSet;

public class FindPair {

  public void checkPairSum(int[] numbers, int sum) {
    HashSet<Integer> complements = new HashSet<>();
    int complement;

    for (Integer nr: numbers) {
      
      complement = sum - nr;
      
      if (complements.contains(nr)) {
        System.out.printf("Pair: {%d, %d} \n", complement, nr);
        break;
      }

      complements.add(complement);
    }

  }

  FindPair() {
    int[] testArray1 = {1,2,3,7};
    int[] testArray2 = {-1,2,3,4};
    int[] testArray3 = {0,1,2,7};
    int[] testArray4 = {1,1,4,2};

    checkPairSum(testArray1, 9);
    checkPairSum(testArray2, 3);
    checkPairSum(testArray3, 10);
    checkPairSum(testArray4, 4);
  }

  public static void main(String[] args) {
    new FindPair();
  }

}
