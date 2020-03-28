/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

class Mymain{
     public static void main(String[] args) {
         MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree ();
         myBinarySearchTree.insert ( 14 );
         myBinarySearchTree.insert ( 13 );
         myBinarySearchTree.insert ( 15 );
         myBinarySearchTree.insert ( 74 );
         myBinarySearchTree.insert ( 10 );
         myBinarySearchTree.insert ( 24 );
         myBinarySearchTree.insert ( 4 );

         System.out.println ("left children of the binary search tree: ");
         myBinarySearchTree.traverse ();
         System.out.println ("no. of parents not having their left child are:");
         System.out.println (myBinarySearchTree.getCountRight ());
     }
}