class ValidPalindrome {
    public boolean isPalindrome (char[] c, int from, int to){
        if (from >= to) return true;
        
        if(c[from] == c[to]) {
            return isPalindrome(c, from + 1, to - 1);
        } else{
            return false;
        }
    }

    private ValidPalindrome (String s) {
        // Replace all that is NOT a character A-Z or a-z
        String stringAnalyze = s.replaceAll("[^A-Za-z]", "").toLowerCase(); 
                
        if(isPalindrome(stringAnalyze.toCharArray(), 0, stringAnalyze.length()-1)){
            System.out.printf("%s is a valid palindrome\n", s);
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        new ValidPalindrome(args[0]);
    }
}