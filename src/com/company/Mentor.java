package com.company;

public class Mentor {
    private String name;
    private String subject;

    @Override
    public String toString(){
        return "\n"+name+" mentoring: "+subject;
    }

    public Mentor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
