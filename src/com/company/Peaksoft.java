package com.company;

import java.sql.Array;

public class Peaksoft {
    private Group[] groups;
    private Student[] students;
    private Mentor[] mentors;
    private Instructor[] instructors;



    public Peaksoft(Group[] groups, Student[] students, Mentor[] mentors, Instructor[] instructors) {
        this.groups = groups;
        this.students = students;
        this.mentors = mentors;
        this.instructors = instructors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }


}
