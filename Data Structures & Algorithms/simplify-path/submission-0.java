class Solution {
    public String simplifyPath(String path) {
        String[] arr= path.split("/");
        Stack<String> stack= new Stack<>();
        for(String a: arr){
            if(a.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!a.equals("") && !a.equals("..") && !a.equals(".")){
                stack.push(a);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(String str : stack){
            sb.append("/");
            sb.append(str);
        }
        return sb.length()==0?"/":sb.toString();
    }
}