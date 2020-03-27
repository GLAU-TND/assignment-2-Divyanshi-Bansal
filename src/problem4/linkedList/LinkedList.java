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
}
