package ra.presentation;

import ra.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    static Map<String, Student> students = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.println("----------------Menu-------------");
            System.out.println("1. Danh sách sinh viên.");
            System.out.println("2. Thêm mới các sinh viên.");
            System.out.println("3. Xóa sinh viên theo mã sinh viên.");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên.");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất.");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất.");
            System.out.println("7. Thoát.");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sinh viên:");
                    for(Map.Entry<String, Student> entry : students.entrySet()){
                        System.out.println(entry.getValue().toString());
                    }
                    break;
                case 2:
                    Student newStudent = new Student();
                    newStudent.inputData(scanner);
                    students.put(newStudent.getStudentID(), newStudent);
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    avgAllStudent();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-7.");
            }

        }while(true);
    }
    public static void removeStudent(){
        System.out.println("ID sinh viên muốn xóa: ");
        String studentID = scanner.nextLine();
        if(students.containsKey(studentID)){
            students.remove(studentID);
            System.out.println("Xóa sinh viên thành công.");
        }else {
            System.out.println("Không tìm thấy sinh viên có id: " + studentID);
        }
    }
    public static void avgAllStudent(){
        double avgScore = 0;
        int count = 0;
        for(Student student : students.values()){
            avgScore += student.getStudentAvgScore();
            count++;
        }
        avgScore /= count;
        System.out.println("Điểm trung bình của tất cả sinh viên là: " + avgScore);
    }

}
