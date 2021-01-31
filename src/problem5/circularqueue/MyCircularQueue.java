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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public Student[] getCircularQueue() {
        return circularQueue;
    }

    public void setCircularQueue(Student[] circularQueue) {
        this.circularQueue = circularQueue;
    }

    public boolean isFull(){
        return size == maxsize;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public void enqueue(Student element){
        if(!isFull()){
            circularQueue[rear] = element;
            rear = (rear+1)%maxsize;
            size++;
        }
        else{
            System.out.println ("CircularQueue is already full..");
        }
    }

    public Student dequeue(){
        Student response = null;
        if(!isEmpty ()){
            size--;
            response = circularQueue[front];
            front = (front+1)%maxsize;
            return response;
        }
        else{
            return response;
        }
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println (circularQueue[(i+front)%maxsize]);
        }
    }

}
