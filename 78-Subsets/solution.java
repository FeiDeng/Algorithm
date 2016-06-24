public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(nums,0,result,new ArrayList<Integer>());
        return result;
    }
    
    public void dfs(int[] nums, int index, List<List<Integer>> res,List<Integer> temp){
        res.add(new ArrayList<Integer>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,i+1,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}