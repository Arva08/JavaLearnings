
/*Question: There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?

Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.
N = 6
start[] = {1,3,0,5,8,5}
end[] =  {2,4,6,7,9,9}
Output: 
4
Explanation:
Maximum four meetings can be held with
given start and end timings.
The meetings are - (1, 2),(3, 4), (5,7) and (8,9)*/

public class NMeetingInOneRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intuition is we have one room. so sort based on end time of meeting
		//and compare the next meeting start time with end time.
		
   /* create the pair array of Pair(end,start)
    * sort the pair[] using comparator Arrays.sort(pairs,(a,b)-> a '-' b)
    *Initiate prevEndTime=Integer.MIN_VALUE,meetingCount=0 iterate from 0 -> end of pair array;
    * compare the start time of pair with prevEndTime
    * if starttime > then we can accomadate the meeting  increase the meeting count
    * else do nothing skip that meeting
    * return the meeting count
    */
	}

}
