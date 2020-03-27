/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String name;
    private int backlog;
    private int appearingCount;

    public Student (String name ,int backlog, int appearingCount ){
        this.name = name;
        this.backlog = backlog;
        this.appearingCount = appearingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    public String toString(){
        return  getName ()+" "+getBacklog ()+" "+getAppearingCount ();
    }
}
