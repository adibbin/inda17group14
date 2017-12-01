class MoveZeros{
    public void move(int[] numbers) {
        if (numbers.length == 0 || numbers == null) return;
        
        int i = 0;
        for (int num: numbers) {
            if (num != 0) {
                numbers[i] = num;
                i++;
            }
        }
        
        while (i < numbers.length) {
            numbers[i] = 0;
            i++;
        }

        for (int x: numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private MoveZeros() {
        int[] test1 = {0,1,0,3,3,8};
        int[] test2 = {1,2,4,0,7,0};
        int[] test3 = {0,0,0,0,0,0};
        int[] test4 = {0,1,0,0,5,0};
        int[] test5 = new int[0];

        move(test1);
        move(test2);
        move(test3);
        move(test4);
        move(test5);
    }

    public static void main(String[] args) {
        new MoveZeros();
    }
}