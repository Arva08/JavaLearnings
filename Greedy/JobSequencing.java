/*
 * Given a set of N jobs where each job has a deadline and profit associated with it.

Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit associated with job if and only if the job is completed by its deadline.

Find the number of jobs done and the maximum profit.

Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.
Input:
N = 4
Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
Output:
2 60
Explanation:
Job1 and Job3 can be done with
maximum profit of 60 (20+40).
 */
public class JobSequencing {
	public static void main(String arg[]){
		/*
		 * Take the max of deadline by Iterating Jobs[]
		 * create the deadlineArr with size max(from above) and put -1 as default value;
		 * sort the jobs arr based on profit Arrays.sort(jobs(a,b)->b.profit - a.profit);
		 * Intialize jobscount and maxProfit to 0;
		 * Iterate the jobs arr 0 to end
		 * take the dealine from job
		 * find the maximum spot for thr deadline value in the dealine array so we can perform the job on the last day of deadline
		 * while(dealineValue >=0 && deadlinearr[dealineValue]!=-1) deadValue--; find a spot to perform the job
		 * dealinearr[deadlineval]=job.id;//means we found deadline spot 
		 * add the job.profit in maxProfit and increase the jobcount
		 * return the jobscount and maxProfit
		 */
		
	}

}
