class Main {
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue{
        static Node head;
        static Node tail;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        
        public static void add(int data){
            if(head == null){
                head = tail = new Node(data);
                return;
            }
            tail.next = new Node(data);
            tail = tail.next;
        }
        
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int ans = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return ans;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
