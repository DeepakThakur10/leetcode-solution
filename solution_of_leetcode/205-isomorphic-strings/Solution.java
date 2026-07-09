class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> st = new HashSet<>();
        HashSet<Character> st2 = new HashSet<>();
        for(char c:s.toCharArray()){
            st.add(c);
                    
        }
        for(char c:t.toCharArray()){
            st2.add(c);
                    
        }
        return st.size() == st2.size();
    }
}