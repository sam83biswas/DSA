class Solution {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        
        Queue(int n){
            size = n;
            arr = new int[n];
            rear = -1;
        }
        
        public static boolean isEmpty(){
            return rear == -1;
        }
        
        public static void add(int num){
            if(rear == size-1){
                return;
            }
            rear = rear + 1;
            arr[rear] = num;
        }
        
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Main.Queue q = new Main.Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
