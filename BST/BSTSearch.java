//Problem:Searching key in BST.
public class Main{
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
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.left=insert(node.left,data);
        }
        else{
            node.right=insert(node.right,data);
        }
        return node;
    }
    public boolean search(Node node,int key){
        if(node==null) return false;
        if(key==node.data){
            return true;
        }
        else if(key<node.data){
            return search(node.left,key);
        }
        else{
            return search(node.right,key);
        }
    }
    public static void main(String[] args){
        Main obj=new Main();
       obj.insert(6);
       obj.insert(8);
       obj.insert(35);
        System.out.println(obj.search(obj.root,6));
    }
}
//Time Complexity:O(h); h-height of bst Space Complexity:O(h); -recursion.
//O(log n) balanced.
//O(n)-for skewed.

   
