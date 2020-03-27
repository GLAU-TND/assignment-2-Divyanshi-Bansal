package problem4.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int data){
        Node node = new Node ( data );
        if(first == null ){
            first = last = node;
            return;
        }
        else{
            last.setNext ( node );
            last = node;
        }
    }

    public void deletefirst(){
        var second = first.getNext ();
        first.setNext ( null );
        first = second;
    }

    public void display(){
        var current = first;
        while(current != null){
            System.out.println (current.getData ());
            current = current.getNext ();
        }
    }
}
