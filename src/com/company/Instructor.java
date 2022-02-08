package com.company;

public class Instructor {
    private String name;
    private String lesson;

    @Override
    public String toString(){
        return "\n"+name+" - lesson: "+lesson;
    }

    public Instructor(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
