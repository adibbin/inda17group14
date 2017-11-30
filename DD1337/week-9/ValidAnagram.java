class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // Room for all the letters in the alphabet
        // a = 97, b = 98, c = 99, ... 
        int[] alphabet = new int[26];
        
        // Increase occurences of letters for string s
        for(char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        
        // Decrease occurences of letters for string t
        for(char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        
        // 0 means it has the same occurences in string s as in string t, if not, not valid
        for(int n : alphabet){
            if(n != 0)
                return false;
        }
        return true;
    }

    /*
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
         
        HashMap<Character, Integer> hm = new HashMap<>(s.length());
         
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == null) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
             
            if (hm.get(t.charAt(i)) == null) {
                hm.put(t.charAt(i), -1);
            } else {
                hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
            }
        }
         
        for (int i: hm.values()) {
            if (i != 0) return false;
        }
         
        return true;
    }*/
     

    private ValidAnagram(String s, String t){
        if(isAnagram(s, t)){
            System.out.printf("%s is an anagram of %s \n", s, t);
        } else {
            System.out.printf("%s is a not an anagram of %s \n", s, t);            
        }
    }

    public static void main(String[] args) {
        new ValidAnagram(args[0], args[1]);
    }
}