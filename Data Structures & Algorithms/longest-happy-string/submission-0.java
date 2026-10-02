class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb= new StringBuilder();
        PriorityQueue<int[]> maxheap= new PriorityQueue<>((x, y)-> y[0]-x[0]);
        if(a>0) maxheap.offer(new int[]{a, 'a'});
        if(b>0) maxheap.offer(new int[]{b, 'b'});
        if(c>0) maxheap.offer(new int[]{c, 'c'});
        while(!maxheap.isEmpty()){
            int[] first= maxheap.poll();
            if(sb.length()>1 && sb.charAt(sb.length()-1)==first[1] && sb.charAt(sb.length()-2)==first[1]){
                if(maxheap.isEmpty()) break;
                int[] second= maxheap.poll();
                sb.append((char)second[1]);
                second[0]--;
                if(second[0]>0)maxheap.offer(second);
                maxheap.offer(first);
            }else{
                sb.append((char) first[1]);
                first[0]--;
                if(first[0]>0) maxheap.offer(first);
            }
        }
        return sb.toString();
    }
}