import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);

        for (Integer i: al) {
            System.out.println(i);
        }
    }
}