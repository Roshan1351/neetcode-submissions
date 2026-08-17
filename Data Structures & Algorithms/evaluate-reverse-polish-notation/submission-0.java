class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String str: tokens){
            if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") ){
                int num= Integer.parseInt(str);
                stack.push(num);
            }else{
                if(str.equals("+")){
                    int n1= stack.pop();
                    int n2= stack.pop();
                    int result= n1+n2;
                    stack.push(result);
                }else if(str.equals("-")){
                    int n1= stack.pop();
                    int n2= stack.pop();
                    int result= n2-n1;
                    stack.push(result);
                }else if(str.equals("*")){
                    int n1= stack.pop();
                    int n2= stack.pop();
                    int result= n2*n1;
                    stack.push(result);
                }else if(str.equals("/")){
                    int n1= stack.pop();
                    int n2= stack.pop();
                    int result= n2/n1;
                    stack.push(result);
                }
            }
        }

        return stack.pop();
    }
}
