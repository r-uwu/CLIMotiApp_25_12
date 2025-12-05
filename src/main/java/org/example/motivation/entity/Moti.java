package org.example.motivation.entity;

public class Moti {
    static int count = 1;
    private int number;
    private String moti;
    private String source = "미상";

    public int getNumber() {
        return number;
    }

    public String getMoti() {
        return moti;
    }

    public String getSource() {
        return source;
    }

    public void setMoti(String moti, String source) {
        this.moti = moti;
        this.source = source;
    }

    public Moti(String moti, String source) {
        this.moti = moti;
        this.source = source;
        this.number = count++;
    }
}