class Main {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }
        
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        
        public static boolean isFull(){
            return (rear+1) == front;
        }
        
        public static void add(int num){
            if(isFull()){
                return;
            }
            //first element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = num;
        }
        
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int ans = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            
            return ans;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
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
