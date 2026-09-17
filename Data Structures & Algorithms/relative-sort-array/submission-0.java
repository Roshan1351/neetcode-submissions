class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map= new HashMap<>();
        
        for(int j= 0; j<arr1.length; j++){
            map.put(arr1[j], map.getOrDefault(arr1[j], 0)+1);
        }
        List<Integer> res= new ArrayList<>();
        for(int num: arr2){
            int freq= map.remove(num);
            for(int i= 0; i<freq; i++){
                res.add(num);
            }
        }
        List<Integer> remain= new ArrayList<>(map.keySet());
        Collections.sort(remain);
        for(int num: remain){
            int freq= map.get(num);
            for(int i= 0; i<freq; i++){
                res.add(num);
            }
        }
        return res.stream().mapToInt(i-> i).toArray();
    }
}