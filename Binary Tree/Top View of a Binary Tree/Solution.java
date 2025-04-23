import java.util.*;
class Solution {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static class Info{
            Node node;
            int hd;
            
            Info(int hd, Node node){
                this.node = node;
                this.hd = hd;
            }
        }
        
        public static void topView(Node root){
            int min = 0;
            int max = 0;
            
            HashMap<Integer, Node> map = new HashMap<>();
            
            Queue<Info> que = new LinkedList<>();
            que.add(new Info(0, root));
            que.add(null);
            
            while(!que.isEmpty()){
                Info curr = que.remove();
                if(curr == null){
                    if(que.isEmpty()){
                        break;
                    }else{
                        que.add(null);
                    }
                }else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd,curr.node);
                        min = Math.min(min, curr.hd);
                        max = Math.max(max, curr.hd);
                    }
                    if(curr.node.left != null){
                        que.add(new Info(curr.hd-1, curr.node.left));
                    }
                    if(curr.node.right != null){
                        que.add(new Info(curr.hd+1, curr.node.right));
                    }
                }
            }
            
            for(int i = min; i<= max; i++){
                System.out.print(map.get(i).data + " ");
            }
            
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        BinaryTree.topView(root);
    }
}
