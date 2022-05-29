/*
 * Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
Note: Unlike 0/1 knapsack, you are allowed to break the item. 
N = 3, W = 50
values[] = {60,100,120}
weight[] = {10,20,30}
Output:
240.00
Explanation:Total maximum value of item
we can have is 240.00 from the given
capacity of sack. 
 */
public class FractionalKnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find the highest value per weight for item and create that array
		 * Form an map with highestValPerweight->Item[weight,value]
		 * sort the higestvalper array descending 
		 * maxProft=0;
		 * weight=0;
		 * Iterate the higestvalper array from 0 to end
		 * take the correponding item from map
		 * if wieght+item.weight<=capacityOfBag
		 * maxProfit+=item.profit;
		 * wiehit+=item.weight
		 * else{
		 * int balanceweight=capacity-weight;
		 * maxprofit+= balanceWeight*heightVal[i];
		 * break
		 * return maxProfit;
		 * }
		 */

	}

}
