import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
    //     long num11=Long.parseLong(num1);
    //     long num22=Long.parseLong(num2);
    //     long res=num11+num22;
    //     StringBuilder sb=new StringBuilder();
    //     sb.append(res);
    //    return sb.toString();
    BigInteger n1=new BigInteger(num1);
    BigInteger n2=new BigInteger(num2);
    return n1.add(n2).toString();
    }
}