/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem4.binarysearchtree.BinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue ();
        BinarySearchTree binarySearchTree = new BinarySearchTree ( myQueue );

        binarySearchTree.insert ( 10 );
        binarySearchTree.insert ( 9 );
        binarySearchTree.insert ( 11 );
        binarySearchTree.insert ( 7 );
        binarySearchTree.insert ( 13 );
        binarySearchTree.insert ( 10 );
        binarySearchTree.preorder ( binarySearchTree.getRoot () );
        myQueue.display ();
    }
}
