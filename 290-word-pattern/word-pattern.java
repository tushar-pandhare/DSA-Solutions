class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch) && !map.get(ch).equals(word)) return false;
            if (reverseMap.containsKey(word) && reverseMap.get(word) != ch) return false;

            map.put(ch, word);
            reverseMap.put(word, ch);
        }

        return true;
    }
}
