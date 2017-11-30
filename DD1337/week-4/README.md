# WEEK 4

#### Exercise 0: Install an IDE
Pretty self explanatory...  

#### Exercise 1: Largest number
Write a program that takes three numers as input and output the largest number of them.

Requirements: Do not use BlueJ...

#### Exercise 2: FizzBuzz
Rewrite last week FizzBuzz using a StringBuilder.

```Java
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
```

Requirements: Do not use BlueJ...

#### Exercise 3: FizzBuzz on Kattis
Complete the FizzBuzz exercise on [Kattis.](https://open.kattis.com/problems/fizzbuzz)