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

}
