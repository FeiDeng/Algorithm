public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(new ArrayList<Integer> ());
        dfs(nums, result, 0,temp);
        return result;
    }
    
    public void dfs(int[] nums, List<List<Integer>> result, int index, List<Integer> temp){
        for(int i = index; i< nums.length; i++){
            temp.add(nums[i]);
            result.add(new ArrayList<Integer> (temp));
            dfs(nums, result, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}