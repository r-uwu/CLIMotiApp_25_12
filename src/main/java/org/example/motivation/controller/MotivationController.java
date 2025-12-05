package org.example.motivation.controller;

import org.example.motivation.entity.Moti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {

    List<Moti> motiList = new ArrayList<>();

    private Scanner sc;
    public MotivationController(Scanner sc) {
        this.sc = sc;
    }



    public void create() {
        //sc.nextLine().trim(); // 버퍼에 남은 엔터때문에 오류나는거 방지용 - trim으로 수정
        System.out.print("motivation : ");
        String moti = sc.nextLine().trim();

        System.out.print("source : ");
        String source = sc.nextLine().trim();
        Moti newMoti = new Moti(moti, source);
        motiList.add(newMoti);
        System.out.println("motivation이 등록 되었습니다.");
    }

    public void read() {
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
