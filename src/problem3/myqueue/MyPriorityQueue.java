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
        if(!linkedList.isEmpty ()){
            System.out.println ("enter student name whose data will delete..");
            String studentname = scanner.nextLine ();
            int position = linkedList.indexOf ( studentname );
            if(position >= 0) {
                linkedList.deleteAtAnyPosition ( position );
                System.out.println ("congoo!! your data has been deleted..");
                size--;
            }
            else{
                System.out.println ("this student "+studentname+" ain't in our class..");
            }

        }
        else{
            System.out.println ("sorry!! already empty list has been found..");
        }
    }


}


