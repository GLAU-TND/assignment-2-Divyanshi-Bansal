/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.LinkedList.LinkedList;
import problem3.student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPriorityQueue {
    LinkedList linkedList = new LinkedList ();
    Scanner scanner = new Scanner ( System.in );
    private int size =0 ;
    private int maxSize ;

    public void enqueue(LinkedList linkedList){
        ArrayList arrayList1 = new ArrayList<String> (  );
        ArrayList arrayList2 = new ArrayList<Integer> (  );
        System.out.println ("enter student name");
        String studentName = scanner.nextLine ();
        System.out.println ("enter your's father name");
        String fathersName =  scanner.nextLine ();
        System.out.println ("enter your's mother name");
        String mothersName = scanner.nextLine ();
        System.out.println ("enter your address");
        String address  = scanner.nextLine ();
        System.out.println ("enter your rollno");
        int rollNo = scanner.nextInt ();
        while (true) {
            System.out.println ( "enter subject's name to add or exit to quit.." );
            String subjects = scanner.nextLine ();
            if(subjects.equals ( "exit" )){
                break;
            }
            arrayList1.add ( subjects );
        }
        while(true) {
            System.out.println ( "enter subject's number as per name or 00 to exit.." );
            int numbers = scanner.nextInt ();
            if (numbers == 00) {
                break;
            }
            arrayList2.add ( numbers );
        }
        linkedList.addThroughSorting ( new Student ( studentName,fathersName,mothersName,address,rollNo,arrayList1,arrayList2 ) );
        size++;
        System.out.println ("your imfo. has been added..");
    }

    public void dequeue(LinkedList linkedList){
        linkedList.deleteFirstNode ();
        size--;
        System.out.println ("your record is deleted..");
    }




    public void display(LinkedList linkedList){
        System.out.println ("welcome to our class...");
        linkedList.displayNode ();
    }

    public void peak(LinkedList linkedList){
        System.out.println ("enter rollno for searching..");
        int rollno = scanner.nextInt ();
        if(linkedList.searchNode (rollno ).equals ("found")){
            System.out.println ("hurry!! your student is in class of rollno is..");
            System.out.println (rollno);
        }
        else{
            System.out.println ("sorry!! not matched..");
        }
    }



}


