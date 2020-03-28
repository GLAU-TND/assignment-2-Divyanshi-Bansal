/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue ();
        MyQueue postQueue = new MyQueue ();
        BinarySearchTree binarySearchTree = new BinarySearchTree ( preQueue, postQueue );
        binarySearchTree.insert ( 14 );
        binarySearchTree.insert ( 10 );
        binarySearchTree.insert ( 1 );
        binarySearchTree.insert ( 24 );
        binarySearchTree.insert ( 4 );
        binarySearchTree.insert ( 34 );
        binarySearchTree.insert ( 4 );
        binarySearchTree.postOrder ( binarySearchTree.getRoot () );
        binarySearchTree.preOrder ( binarySearchTree.getRoot () );
        System.out.println ("PreOrder");
        preQueue.display ();
        System.out.println ("PostOrder");
        postQueue.display ();
        System.out.println ();
    }
}
