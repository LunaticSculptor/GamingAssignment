package com.example.gaming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Gaming {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game that you want to run [Pacman -> 1, Mario -> 2, TempleRun -> 3, Default -> 0]: ");
        int choice = scanner.nextInt();

        Game game;
        switch (choice) {
            case 1:
                game = context.getBean("pacman", Game.class);
                break;
            case 2:
                game = context.getBean("mario", Game.class);
                break;
            case 3:
                game = context.getBean("templeRun", Game.class);
                break;
            default:
                game = context.getBean("mario", Game.class); // default game
                break;
        }

        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
