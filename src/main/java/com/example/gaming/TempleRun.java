package com.example.gaming;

public class TempleRun implements Game {
    @Override
    public void up() {
        System.out.println("TempleRun jumps");
    }

    @Override
    public void down() {
        System.out.println("TempleRun slides down");
    }

    @Override
    public void left() {
        System.out.println("TempleRun moves left");
    }

    @Override
    public void right() {
        System.out.println("TempleRun moves right");
    }
}
