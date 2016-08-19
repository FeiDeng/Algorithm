public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        result.add(temp);
        dfs(nums,result,temp,0);
        return result;
    }
    
    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> temp, int index){
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            result.add(new ArrayList<Integer>(temp));
            dfs(nums,result,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}