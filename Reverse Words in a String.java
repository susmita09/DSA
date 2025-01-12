class Solution {
    // TC - o(N) SC - 0(N)
    public String reverseWords(String s) {
       
       String[] words = s.split("\\s+"); //splits on 1 or more white spaces in between words

       StringBuilder sb = new StringBuilder();

       for(int i =words.length-1; i>= 0;i--){
        sb.append(words[i]);
        sb.append(" "); //after eacg word ppend a space
       }
        return sb.toString().trim();
        
    }
}
