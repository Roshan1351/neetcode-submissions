class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> arr1= new ArrayList<>();
        for(int a: arr){
            arr1.add(a);
        }

        Collections.sort(arr1, (a, b)->{
            int d1= Math.abs(a-x);
            int d2= Math.abs(b-x);

            if(d1!= d2){
                return d1-d2;
            }

            return a-b;
        });

        List<Integer> ans= new ArrayList<>();
        for(int i= 0; i<k; i++){
            ans.add(arr1.get(i));
        }

        Collections.sort(ans);
        return ans;
    }
}