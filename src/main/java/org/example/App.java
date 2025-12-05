package org.example;

import org.example.motivation.controller.MotivationController;
import org.example.motivation.entity.Moti;
import org.example.system.controller.SystemController;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }

    //static ArrayList<Moti> motiList = new ArrayList<Moti>();

    public void run(){

        System.out.println("== motivation 실행 ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);

        String input;
        while(true) {
            input = sc.nextLine().trim();

            if (input.equals("종료")||input.equals("exit")) {
                SystemController.exit();
                break;
            }

            if (input.equals("등록")||input.equals("add")) {

                motivationController.create();

            }
            else if (input.equals("목록")||input.equals("list")) {

               motivationController.read();

            }
            else if(input.equals("수정")||input.equals("edit")||input.equals("update")) {
                motivationController.update();
            }
            else {
                System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            }
        }
    }
    /* motivation.controller.MotivationController로 이동함
    void create()
    {

    }
    void read()
    {

    }
    void update()
    {

    }
    void delete()
    {

    }
     */

}