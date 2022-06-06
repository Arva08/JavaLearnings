
public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,3,2,2};
		int majorityElem=0;
		int majorityElemCount=0;
		for(int num:nums){
			if(majorityElemCount==0){
				majorityElem=num;
				majorityElemCount++;
			}
			else if (majorityElem==num){
				majorityElemCount++;
			}
			else{
				majorityElemCount--;
			}
		}
		System.out.println(majorityElem);

	}

}
