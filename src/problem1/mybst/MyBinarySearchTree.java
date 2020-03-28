/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;

    public void insert(int data){
        TreeNode node = new TreeNode ( data );
        if(root == null){
            return;
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

    public int getCountRight() {
        return countRight;
    }

    public void setCountRight(int countRight) {
        this.countRight = countRight;
    }

    public  void preOrder(TreeNode temp){
        if(temp == null){
            return;
        }
        else{
            System.out.println (temp.getData ());
            preOrder ( temp.getLeft () );
            preOrder ( temp.getRight () );
        }
    }
}
