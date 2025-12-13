class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> finalStr = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (isAlphaNum(i, code) && isActiveCheck(i, isActive) && isValidBuisness(i, businessLine) && !code[i].equals("")) {
                finalStr.add(businessLine[i] + "!" + code[i]);
            }
        }

        List<String> ans=new ArrayList<>();
        Collections.sort(finalStr);
        for(String s: finalStr){
            ans.add(s.split("!")[1]);
        }       
        return ans;
    }

    public boolean isAlphaNum(int i, String code[]){
        StringBuilder sb=new StringBuilder();
        for(int j = 0; j < code[i].length(); j++){
            
            char ch = code[i].charAt(j);
            sb.append(ch);
            if(!(ch >= 'a' && ch <= 'z' ||
                  ch >= 'A' && ch <= 'Z' ||
                  ch >= '0' && ch <= '9' || 
                  ch == '_')){
                return false;
            }
            
        }
        
        return true;
    }

    public boolean isActiveCheck(int i, boolean[] isActive){
        if(isActive[i] == true) return true;
        return false;
    }

    public boolean isValidBuisness(int i, String businessLine[]){
        if(businessLine[i].equals("electronics") ||
            businessLine[i].equals("grocery") ||
            businessLine[i].equals("pharmacy") ||
            businessLine[i].equals("restaurant")) {
            return true;
        }
        return false;
    }
}
