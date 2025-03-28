package main;

import models.Student;
import factory.StudentFactory;
import java.util.Scanner;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu nhập thông tin sinh viên
        System.out.print("Student name? ");
        String name = scanner.nextLine();

        System.out.print("Grade? ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        // Tạo sinh viên với ID tự động
        String id = "S" + (int)(Math.random() * 1000); 
        Student student = StudentFactory.createStudent(id, name, grade);

        // Xuất kết quả
        System.out.println(name + " belongs to " + student.getGroupName() + ", which can register " + student.getAllowedCourses() + ".");
        
        scanner.close();
    }
}
