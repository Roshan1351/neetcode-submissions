class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int BoatCount= 0;
        Arrays.sort(people);
        int i= 0;
        int j= people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                BoatCount++;
            }else{
            j--;
            BoatCount++;
            }

        }
        return BoatCount;
    }
}