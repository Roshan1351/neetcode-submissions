/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    int meeting(List<Integer> start, List<Integer> stop){
        int n= start.size();
        int i= 0, j= 0, res= 0;
        int room= 0;
        Collections.sort(start);
        Collections.sort(stop);

        while(i<n && j<n){
            if(start.get(i)<stop.get(j)){
                room++;
                i++;
                res= Math.max(room, res);
            }else{
                room--;
                j++;
            }
        }
        return res;
    }
    public int minMeetingRooms(List<Interval> intervals) {
        List<Integer> start= new ArrayList<>();
        List<Integer> stop= new ArrayList<>();
        for(int i= 0; i<intervals.size(); i++){
            start.add(intervals.get(i).start);
            stop.add(intervals.get(i).end);
        }
        int ans= meeting(start, stop);
        return ans;
    }
}
