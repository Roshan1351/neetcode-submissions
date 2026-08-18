class pairs{
    int position;
    int speed;

    pairs(int position, int speed){
        this.position= position;
        this.speed= speed;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<pairs> list= new ArrayList<>();
        for(int i= 0; i<position.length; i++){
            list.add(new pairs(position[i], speed[i]));
        }

        list.sort((a, b)->a.position-b.position);

        int fleet= 0;
        double maxTime= 0;

        for(int i= list.size()-1; i>= 0; i--){
            double time= (double)(target-list.get(i).position)/list.get(i).speed;

            if(time>maxTime){
                fleet++;
                maxTime= time;
            }else{
                continue;
            }
        }
        return fleet;
    }
}
