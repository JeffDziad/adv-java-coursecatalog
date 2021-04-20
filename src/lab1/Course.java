package lab1;

import javax.swing.*;

public abstract class Course {

    String courseNumber;
    String courseName;
    double credits;

    //getters
    public String getCourseName() { return courseName; }
    public String getCourseNumber() { return courseNumber; }
    public double getCredits() { return credits; }

    //setter
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    public void setCourseNumber(String courseNumber) { this.courseNumber = courseNumber; }
    public void setCourseName(String courseName) { this.courseName = courseName; };

}
