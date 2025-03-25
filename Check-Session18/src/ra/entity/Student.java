package ra.entity;

import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private int studentAge;
    private float studentAvgScore;

    public Student() {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAvgScore = studentAvgScore;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public float getStudentAvgScore() {
        return studentAvgScore;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentAvgScore(float studentAvgScore) {
        this.studentAvgScore = studentAvgScore;
    }

    public void inputData(Scanner scanner) {
        System.out.println("ID: ");
        this.studentID = scanner.nextLine();
        System.out.println("Tên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Tuổi: ");
        this.studentAge = scanner.nextInt();
        System.out.println("Điểm trung bình: ");
        this.studentAvgScore = scanner.nextFloat();
    }
    @Override
    public String toString() {
        return "ID: " + studentID + ", Tên: " + studentName +", Tuổi: " + studentAge +", Điểm trung bình: " + studentAvgScore;
    }


}

