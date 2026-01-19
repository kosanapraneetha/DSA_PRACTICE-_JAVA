//Problem:BST Insertion
public class BSTInsert{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    Node root;
    public void insert(int data){
        root=insert(root,data);
    }
    private Node insert(Node node,int data){
        if(node==null) return new Node(data);
        if(data<node.data) {
        node.left=insert(node.left,data);
        }
        else if(data>node.data) {
            node.right=insert(node.right,data);
        }
        return node;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[] args){
        BSTInsert obj=new BSTInsert();
        obj.insert(8);
        obj.insert(10);
        obj.insert(13);
        obj.insert(15);
        obj.insert(23);
       inorder(obj.root);
    }
}
//Mostly BST's complexity's are O(h);
