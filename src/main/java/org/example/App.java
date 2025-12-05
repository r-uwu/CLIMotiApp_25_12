package org.example;

import org.example.motivation.controller.MotivationController;
import org.example.motivation.entity.Moti;
import org.example.system.controller.SystemController;

import static org.example.Container.sc;


public class App {

    public void run(){

        System.out.println("== motivation 실행 ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();

        String input;
        while(true) {
            input = Container.getSc().nextLine().trim();

            if (input.equals("종료")||input.equals("exit")) {
                SystemController.exit();
                break;
            }

            if (input.equals("등록")||input.equals("add")) {

                motivationController.create();

            }
            else if (input.equals("목록")||input.equals("list")) {

               motivationController.list();

            }
            else if(input.equals("수정")||input.equals("edit")||input.equals("update")) {
                motivationController.update();
            }
            else if(input.equals("삭제")||input.equals("delete"))
            {
                motivationController.delete();
            }
            else if(input.equals("찾기")||input.equals("detail"))
            {
                motivationController.detail();
            }
            else {
                System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            }
        }
    }
}