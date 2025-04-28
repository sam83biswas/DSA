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
        public static Node lca(Node root, Node n1, Node n2){
            if(root == null || root.data == n1.data || root.data == n2.data){
                return root;
            }
            
            Node left = lca(root.left, n1, n2);
            Node right = lca(root.right, n1, n2);
            
            if(left == null){
                return right;
            }
            
            if(right == null){
                return left;
            }
            
            return root;
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
        
        System.out.println(BinaryTree.lca(root, root.left.left, root.left.right).data);
    }
}
