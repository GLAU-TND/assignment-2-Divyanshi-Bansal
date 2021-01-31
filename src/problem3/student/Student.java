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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }


}
