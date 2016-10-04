public class Solution {
    public String addBinary(String a, String b) {
        
        
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        int da = 0;
        int db = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0){
            da = a.charAt(i) - '0';
            db = b.charAt(j) - '0';
            sum = da + db + carry;
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        while(i >= 0){
            da = a.charAt(i) - '0';
            sum = da + carry;
            sb.append(sum%2);
            carry = sum/2;
            i--;
        }
        while(j >= 0){
            db = b.charAt(j) - '0';
            sum = db + carry;
            sb.append(sum%2);
            carry = sum/2;
            j--;
        }
        if(carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}