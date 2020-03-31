/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.LinkedList;

import problem3.student.Student;
import problem3.myqueue.MyPriorityQueue;
import java.time.Period;

public class LinkedList {
    Student student;
    private Node first;
    private Node last;
    private class Node{
        private Student data;
        private Node next;


        public Node(Student item){
            this.data = item;
        }
    }



    public int indexOf(String studentName){
        Node current = first;
        int index =1 ;
        while(current != null){
            if(current.data.getStudentName ().equals ( studentName )){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void deleteFirstNode() { //int value likhna hai
        var second = first.next;
        first.next = null;
        first = second;
    }
    public void deleteAtAnyPosition(int position){
        Node current = first;
        Node previous = first;
        Node tempo = first;
        if(position >0) {
            int i = 0;
            while (i <= position - 1) {
                previous = current;
                current = current.next;
                i++;
            }

            current = previous.next;
            previous.next = current.next;
            tempo = current.next;
        }
        else{
            var second = first.next;
            first.next = null;
            first = second;
            tempo = second;
        }
        while(tempo != null){
            tempo = tempo.next;
        }
    }


    public void displayNode(){
        Node current = first;
        int i=1;
        while(current !=null){
            System.out.println (i +"----------------------");
            System.out.println ("Student Name : "+current.data.getStudentName ());
            System.out.println ("Father's Name :"+current.data.getFathersName ());
            System.out.println ("Mother's Name :"+current.data.getMothersName ());
            System.out.println ("Roll No. :"+current.data.getRollNo ());
            System.out.println ("Subjects :"+current.data.getSubjects ());
            System.out.println ("Numbers :"+current.data.getNumbers ());
            System.out.println ("Address :"+current.data.getAddress ());
            System.out.println ("--------------------------------");
            i++;
            current = current.next;
        }

    }


    public Student  lastNode(){
        return last.data;
    }
    public Boolean isEmpty(){
        if(first == null){
            return true ;
        }
        return false;
    }


    public String searchNode(int value){
        //Node node = new Node ( value );
        Node current = first;
        while(current != null){
            if(current.data.getRollNo () == value){
                String found;
                return "found";
            }
            current = current.next;
        }
        return "notfound";
    }

    public void addThroughSorting(Student element){
        Node node = new Node( element );

        if(first == null){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
            Node current = first;
            while (current != null) {
                if (node.data.getRollNo() < current.data.getRollNo ()) {
                    Student c = node.data;
                    node.data = current.data;
                    current.data = c;
                }
                current = current.next;
            }

        }
    }



}


