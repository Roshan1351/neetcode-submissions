class MyQueue {
    Stack<Integer> s;
    Stack<Integer> s1= new Stack<>();
    public MyQueue() {
        s= new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        while(s.size()>1){
            s1.push(s.pop());
        }
        int res= s.pop();
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        return res;
    }
    
    public int peek() {
        while(s.size()>1){
            s1.push(s.pop());
        }
        int res= s.peek();
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */