package org.example.motivation.controller;

import org.example.motivation.entity.Moti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {

    ArrayList<Moti> motiList = new ArrayList<>();

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

    public void list() {
        System.out.println("==================================================");
        System.out.println(" 번호  /  source  /          motivation");
        for(Moti m : motiList) {
            System.out.printf(" %4d  / %8s / %s \n", m.getNumber(), m.getSource(), m.getMoti());
        }
        System.out.println("==================================================");
    }

    public void update()
    {
        System.out.print("number to edit : ");
        int tempNumber = sc.nextInt();
        sc.nextLine(); //버퍼 비우는 용도

        Moti target = motiList.stream().filter(m -> m.getNumber() == tempNumber).findFirst().orElse(null);

        if(target == null){
        System.out.println("없는 번호의 motivation 입니다.");
        return;
        }

        System.out.print("edit source : ");
        String source = sc.nextLine().trim();
        System.out.print("edit motivation : ");
        String moti = sc.nextLine().trim();

        target.setMoti(moti, source);

    }

    public void delete()
    {
        System.out.print("number to delete : ");
        int tempNumber = sc.nextInt();
        sc.nextLine();

        motiList.removeIf( m -> m.getNumber() == tempNumber);
    }

    public void detail()
    {
        System.out.print("number to detail : ");
        int tempNumber = sc.nextInt();
        sc.nextLine();

        Moti target = motiList.stream().filter(m -> m.getNumber() == tempNumber).findFirst().orElse(null);
        if(target == null){
            System.out.println("motivation을 조회할 수 없습니다");
            return;
        }

        System.out.printf("number : %d번\n",target.getNumber());
        System.out.printf("source : %s\n",target.getSource());
        System.out.printf("moti : %s\n",target.getMoti());
    }
}
