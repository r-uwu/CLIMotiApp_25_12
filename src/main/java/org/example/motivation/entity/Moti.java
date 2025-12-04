package org.example.motivation.entity;

public class Moti{
    static int count = 1;
    private int number;
    private String moti;
    private String source = "미상";

    public int getNumber()
    {
        this.number = number;
        return number;
    }
    public String getMoti()
    {
        this.moti = moti;
        return moti;
    }
    public String getSource()
    {
        this.source = source;
        return source;
    }

    public Moti(String moti, String source) {
        this.moti = moti;
        this.source = source;
        this.number = count++;
    }
}