package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Group group5 = new Group("JS-5","Java-5","03.01.2022");
	Group group4 = new Group("JS-4","Java-4","10.09.2021");
	Group group3 = new Group("JS-3","Java-3","07.06.2021");
    Group group = new Group("Javascript","Java","2020");



    Student student1 = new Student("J.B", group5.java, group5.date);
    Student student2 = new Student("K.B",group4.javascript, group4.date);
    Student student3 = new Student("A.T", group3.java, group3.date);

    Student[] students = {student1,student2,student3};

    Mentor mentor1 = new Mentor("A.N",group5.java);
    Mentor mentor2 = new Mentor("B.M",group3.javascript);

    Mentor[] mentors = {mentor1,mentor2};

    Instructor instructor1 = new Instructor("Z.S",group.java);
    Instructor instructor2 = new Instructor("M.A",group.javascript);

    Instructor[] instructors = {instructor1,instructor2};
    Group[] groups = {group5, group4,group3};
    Peaksoft peaksoft = new Peaksoft(groups,students,mentors,instructors);


//        for (Group a:peaksoft.getGroups()){
//            System.out.println(a.java);
//
//        }
        System.out.println("WELCOME TO PEAKSOFT!");
        System.out.println("______________________________________");
        System.out.println("Peaksoft House consists: ");
        System.out.print("groups: ");
        System.out.println(Arrays.toString(peaksoft.getGroups()));
        System.out.println("______________________________________");
        System.out.print("students: ");
        System.out.println(Arrays.toString(peaksoft.getStudents()));
        System.out.println("______________________________________");
        System.out.print("instructors: ");
        System.out.println(Arrays.toString(peaksoft.getInstructors()));
        System.out.println("______________________________________");
        System.out.print("mentors: ");
        System.out.println(Arrays.toString(peaksoft.getMentors()));


    }

}
