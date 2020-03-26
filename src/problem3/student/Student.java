package problem3.student;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private String fathersName;
    private String mothersName;
    private String address;
    private int rollNo ;
    private ArrayList<String> subjects;
    private ArrayList<Integer> numbers;

    public Student(String StudentName , String fathersName , String mothersName , String address , int rollNo , ArrayList<String> subjects, ArrayList<Integer> numbers){
        this.address = address;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.numbers = numbers;
        this.rollNo = rollNo;
        this.studentName = StudentName;
        this.subjects = subjects;
    }



}
