import java.util.ArrayList;
import java.util.List;


public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates ={3,3,4,7};
		int target=7;
		//ans list of comibinations
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		combinationSum2(ans,candidates,target,0,0,new ArrayList<Integer>());
		System.out.println(ans);
	}

	private static void combinationSum2(List<List<Integer>> ans,
			int[] candidates, int target, int start, int sum,
			ArrayList<Integer> list) {
		if(sum==target){
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		if(start>=candidates.length) return;
		for(int dp=start;dp<candidates.length;dp++){
			if(dp!=start && candidates[dp]==candidates[dp-1]) continue;
			if(sum+candidates[dp]<=target){
				list.add(candidates[dp]);
				combinationSum2(ans, candidates, target, dp+1, sum+candidates[dp], list);
				list.remove(list.size()-1);
			}
		}
		
	}

}
