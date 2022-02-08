package com.company;

public class Group {
    public String javascript;
    public String java;
    public String date;

    @Override
    public String toString(){
        return "\n"+java+" Start: "+date+"\n"+javascript+ " Start: "+date;
    }

    public Group(String javascript, String java, String date) {
        this.javascript = javascript;
        this.java = java;
        this.date = date;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
