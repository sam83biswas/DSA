import java.util.*;
class Solution {
    static class Node {
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
            int diam;
            int height;
            
            Info(int height, int diam){
                this.height = height;
                this.diam = diam;
            }
        }
        
        public static Info diameter(Node root){
            if(root == null){
                return new Info(0,0);
            }
            
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);
            
            int diam = Math.max(leftInfo.height+rightInfo.height+1, 
                       (Math.max(leftInfo.diam,rightInfo.diam)));
            
            int height = Math.max(leftInfo.height,rightInfo.height) + 1;
            
            return new Info(height,diam);
            
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        System.out.print("height:" + BinaryTree.diameter(root).height + " " + "diameter:" + BinaryTree.diameter(root).diam);
    }
}
