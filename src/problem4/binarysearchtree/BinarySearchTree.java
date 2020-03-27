package problem4.binarysearchtree;


import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private MyQueue myQueue;

    public BinarySearchTree(MyQueue queue){
        this.myQueue = queue;
    }

    private TreeNode root;

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root == null){
            root = node;
        }
        else{
            TreeNode current = root;
            TreeNode parent = null;
            while(current != null){
                parent = current;
                if(node.getData () < current.getData ()){
                    current = current.getLeft ();
                }
                else{
                    current = current.getRight ();
                }
            }
            if(node.getData ()<parent.getData ()){
                parent.setLeft ( node );
            }
            else{
                parent.setRight ( node );
            }
        }
    }
}
