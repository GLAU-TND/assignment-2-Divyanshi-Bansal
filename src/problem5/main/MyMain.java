/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue ( 3 );
        myCircularQueue.enqueue ( new Student ( "D",0,0 ) );
        myCircularQueue.enqueue ( new Student ( "T",1,1 ) );
        myCircularQueue.enqueue ( new Student ( "A",2,2 ) );
        for(int i = 0 ; i < myCircularQueue.getSize ()+1 ; i++){
            Student s = myCircularQueue.dequeue ();
            if(s.getBacklog ()-s.getAppearingCount () != 0){
                myCircularQueue.enqueue ( s );
            }
        }
        myCircularQueue.display ();
    }
}
