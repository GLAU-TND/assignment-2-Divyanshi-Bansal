package problem2.main;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue postQueue;

    public BinarySearchTree (MyQueue preQueue , MyQueue postQueue){
        this.postQueue = postQueue;
        this.preQueue = preQueue;
    }

    public void insert(int data){
        TreeNode node = new TreeNode ( data );
        if(root == null){
            root = node;
        }
        else{
            TreeNode current = root;
            TreeNode parent = null;
            while(current != null){
                parent = current ;
                if(node.getData () < current.getData ()){
                    current = current.getLeft ();
                }
                else{
                    current = current.getRight ();
                }
            }
            if(node.getData () < parent.getData ()){
                parent.setLeft ( node );
            }
            else{
                parent.setRight ( node );
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public MyQueue getPreQueue() {
        return preQueue;
    }

    public void setPreQueue(MyQueue preQueue) {
        this.preQueue = preQueue;
    }

    public MyQueue getPostQueue() {
        return postQueue;
    }

    public void setPostQueue(MyQueue postQueue) {
        this.postQueue = postQueue;
    }

    public void preOrder(TreeNode temp){
        if(temp == null){
            return;
        }
        else{
            preQueue.enqueue ( temp.getData () );
            preOrder ( temp.getLeft () );
            preOrder ( temp.getRight () );
        }
    }

    public void postOrder(TreeNode temp){
        if(temp == null){
            return;
        }
        else{
            postOrder ( temp.getLeft () );
            postOrder ( temp.getRight () );
            postQueue.enqueue ( temp.getData () );
        }
    }

    public void inOrder(TreeNode temp){
        if(temp == null){
            return;
        }
        else{
            inOrder ( temp.getLeft () );
            System.out.println (temp.getData ());
            inOrder ( temp.getRight () );
        }
    }
}
