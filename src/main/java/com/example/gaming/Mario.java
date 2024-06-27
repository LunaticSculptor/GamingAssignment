package com.example.gaming;

public class Mario implements Game {
    @Override
    public void up() {
        System.out.println("Mario jumps");
    }

    @Override
    public void down() {
        System.out.println("Mario goes down into a pipe");
    }

    @Override
    public void left() {
        System.out.println("Mario moves left");
    }

    @Override
    public void right() {
        System.out.println("Mario moves right");
    }
}
