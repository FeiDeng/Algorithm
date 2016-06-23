public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,m1=0,m2=0;
        for(int i:nums){
            if(m1==i){
                c1++;
            }else if(m2==i){
                c2++;
            }else if(c1==0){
                m1=i;
                c1=1;
            }else if(c2==0){
                m2=i;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        for(int j:nums){
            if(j==m1){
                c1++;
            }else if(j==m2){
                c2++;
            }
        }
        List<Integer> res=new ArrayList<>();
        if(c1>nums.length/3) res.add(m1);
        if(c2>nums.length/3) res.add(m2);
        return res;
    }
}