/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.linkedList.LinkedList;

public class MyQueue {
    LinkedList linkedList = new LinkedList ();

    public void enqueue(int data){
        linkedList.addLast ( data );
    }

    public void dequeue(){
        linkedList.deletefirst ();
    }


    public void display(){
        linkedList.display ();
    }
}
