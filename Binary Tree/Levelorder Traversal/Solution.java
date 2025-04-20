import java.util.*;
class Main {
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
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
            
        }
        
        public static void levelOrder(Node root){
            Queue<Node> que = new LinkedList<>();
            que.add(root);
            que.add(null);
            
            while(!que.isEmpty()){
                Node currNode = que.remove();
                if(currNode == null){
                    System.out.println();
                    if(que.isEmpty()){
                        break;
                    }else{
                        que.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        que.add(currNode.left);
                    }
                    if(currNode.right != null){
                        que.add(currNode.right);
                    }
                }
            }
            
        }
        
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.levelOrder(root);
    }
}
