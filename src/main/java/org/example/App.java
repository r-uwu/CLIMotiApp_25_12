package org.example;

import org.example.motivation.entity.Moti;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }

    static ArrayList<Moti> motiList = new ArrayList<Moti>();

    public void run(){
        System.out.println("== motivation 실행 ==");
        String input;
        while(true) {
            input = sc.next();

            if (input.equals("등록")||input.equals("add")) {
                create();
            }
            else if (input.equals("목록")||input.equals("list")) {
                read();

            } else if (input.equals("종료")||input.equals("exit")) {
                System.out.print("== motivation 종료 ==");
                return;
            }
            else {
                System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            }
        }
    }

    void create()
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
    void read()
    {
        System.out.println("==================================================");
        System.out.println(" 번호  /  source  /          motivation");
        for(Moti m : motiList) {
            System.out.printf(" %4d  / %8s / %s \n", m.getNumber(), m.getSource(), m.getMoti());
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