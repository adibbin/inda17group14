# WEEK 11

## Move Zeros

Given a array `numbers`, write a method that moves all the zeros to the end and keeps the relative order.

Example:

[0, 1, 0, 3, 3, 8] => [1, 3, 3, 8, 0, 0]

[1, 2, 4, 0, 7, 0] => [1, 2, 4, 7, 0, 0]

### Base code:

```java
class MoveZeros{
    public void move(int[] numbers) {
        // TODO: code
    }

    private MoveZeros() {
        int[] test1 = {0,1,0,3,3,8};
        int[] test2 = {1,2,4,0,7,0};
        int[] test3 = {0,0,0,0,0,0};
        int[] test4 = new int[0];

        move(test1);
        move(test2);
        move(test3);
        move(test4);
    }

    public static void main(String[] args) {
        new MoveZeros();
    }
}
```