class Solution {
    public static int canBeTypedWords(String text,String brokenLetters){
        HashSet<Character> set=new HashSet<>();
        for(char c:brokenLetters.toCharArray()) set.add(c);
        String[] arr=text.split(" ");
        int count=0;
        for(String s:arr){
            boolean f=true;
            for(char c:s.toCharArray()){
                if(set.contains(c)){
                    f=false;
                    break;
                }
            }
            if(f) count++;
        }
        return count;
    }
}