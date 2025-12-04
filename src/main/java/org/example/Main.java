package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Moti> motiList = new ArrayList<Moti>();
    //Moti moti = new Moti();

    public static void main(String[] args) {

        System.out.println("== motivation 실행 ==");
        String input;
        while(true) {
            input = sc.next();

            if (input.equals("등록")) {
                create();
            }
            else if (input.equals("목록")) {
                read();

            } else if (input.equals("종료")) {
                System.out.print("== motivation 종료 ==");
                return;
            }
            else {
                System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            }
        }

    }

    static void create()
    {
        sc.nextLine(); // 버퍼에 남은 엔터때문에 오류나는거 방지용
        System.out.print("motivation : ");
        String moti = sc.nextLine();

        System.out.print("source : ");
        String source = sc.nextLine();
        Moti newMoti = new Moti(moti, source);
        motiList.add(newMoti);
        System.out.println("motivation이 등록 되었습니다.");

    }
    static void read()
    {
        System.out.println("==================================================");
        System.out.println(" 번호  /  source  /          motivation");
        for(Moti m : motiList) {
            System.out.printf(" %4d  / %8s / %s \n", m.number, m.source, m.moti);
        }
        System.out.println("==================================================");
    }
    void update()
    {

    }
    void delete()
    {

    }
}

class Moti{
    static int count = 1;
    int number;
    String moti;
    String source = "미상";

    public Moti(String moti) {
        this.moti = moti;
        this.number = count++;
    }

    public Moti(String moti, String source) {
        this.moti = moti;
        this.source = source;
        this.number = count++;
    }

    Moti(){
        this.number = count++;
    }

}