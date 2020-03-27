/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private int size;
    private int maxsize;
    private int front;
    private int rear;
    private Student[] circularQueue;

    public MyCircularQueue(int maxsize){
        this.maxsize = maxsize;
        this.front =0;
        this.rear = 0;
        this.size =0;
        circularQueue = new Student[maxsize];
    }
}
