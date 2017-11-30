# WEEK 9

## 1. Anagram

An anagram is a word that has been formed by rearranging the letters of different word.

Example:

* inda = dina
* ric = irc
* ab = ba
* silent = listen

### Exercise 1.1 Valid Anagram

Given two strings *s* and *t*, write a method to determine if *t* is an anagram of *s*.

```java
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        /// Write your code here
    }

    private ValidAnagram(String s, String t){
        if(isAnagram(s, t)){
            System.out.printf("%s is an anagram of %s", s, t);
        } else {
            System.out.printf("%s is a not an anagram of %s", s, t);            
        }
    }

    public static void main(String[] args) {
        new ValidAnagram(args[0], args[1]);
    }
}
```

> Hint: You may want to use an HashMap, but not necessarily...

```terminal
$ javac ValidAnagram.java
$ java ValidAnagram ba ab
ba is an anagram of ab
```

### Exercise 1.2 Optimizing

Implement your solution using an Array, **NOT** ArrayList.

### Trivia

1. Try googling *anagram*.

## 2. Recursion

### Exercise 2.1 Factorial

Write a program that recursively calculates a factorial of given number.

```bash
$ javac Recursion.java
$ java Recursion 10
3628800
```

### Exercise 2.1 Fibonacci number

Fibonaccis number is given by the formula:

```bash
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2)
```

Extend your program with a method that calculates Fibonacci(n) recursively.

```bash
$ javac Recursion.java
$ java Recursion 10
3628800
55
```

### Trivia

1. Try googling *recursion*.
