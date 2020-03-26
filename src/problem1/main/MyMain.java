/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem3.LinkedList.LinkedList;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList ();
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue ();
        Scanner scanner = new Scanner ( System.in );
        String choice = "0";
        while(choice != "5"){
            System.out.println ();
            System.out.println ("Welcome to Divyanshi's class...!!");
            System.out.println ("Press 1 to add a new record.");
            System.out.println ("Press 2 to view all records.");
            System.out.println ("Press 3 to search for a record.");
            System.out.println ("Press 4 to delete a record");
            System.out.println ("Press 5 to exit program");

            choice = scanner.nextLine ();

            switch(choice){
                case "1":myPriorityQueue.enqueue ( linkedList );
                    break;
                case "2":myPriorityQueue.display ( linkedList);
                    break;
                case "3":myPriorityQueue.peak ( linkedList );
                    break;
                case "4":myPriorityQueue.dequeue (linkedList);
                    break;
                case "5":
                    System.out.println ("Thankyou for visiting.. ");
                    choice ="5";
                    break;
                default:
                    System.out.println ("Invalid choice!");
            }
        }

    }
}

