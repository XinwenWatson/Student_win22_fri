/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_w22_fri;

/**
 *
 * @author Administrator
 */
public class StudentList {
    public static void main(String[] args) {
        Student[] studentList=new Student[4];
        studentList[0]=new Student("s1","Ronak Sheth");
        studentList[1]=new Student("s2","John doe");
        studentList[2]=new Student("s3","abc");

        for(int i=0; i<studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
            
        }
    }
    
}
