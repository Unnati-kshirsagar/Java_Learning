package com.practice.oop;

class Students1 {
    String name;
    int marks;
    int rollno;
}

public class ArrayOfStudent {
    public static void main(String[] args) {
        Students1 s1 = new Students1();
        s1.name = "Unnati";
        s1.marks = 20;
        s1.rollno = 1;

        Students1 s2 = new Students1();
        s2.name = "Utkarsh";
        s2.marks = 30;
        s2.rollno = 2;

        Students1[] students = new Students1[2];
        students[0] = s1;
        students[1] = s2; // You had students[2], which was leaving index 1 null

        for (int i = 0; i < students.length; i++) {
        	System.out.println(students[i].name + " : " + students[i].marks);
            
                
            
        }
    }
}
