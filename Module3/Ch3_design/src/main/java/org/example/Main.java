package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 定義常數
        final int ACTION = 1;
        final int COMEDY = 2;
        final int DOCUMENTARY = 3;
        final int SCI_FI = 4;

        enum MovieType {
            ACTION, COMEDY, DOCUMENTARY, SCI_FI
        }

        MovieType movieType = MovieType.ACTION;

        switch (movieType) {
            case ACTION:
                System.out.println("蜘蛛人");
                break;
            case COMEDY:
                System.out.println("博物館驚魂夜");
                break;
            case DOCUMENTARY:
                System.out.println("Dicovery");
                break;
            case SCI_FI:
                System.out.println("奇異博士");
        }

        for (MovieType mg: MovieType.values()) {
            System.out.println("Type: " + mg);
        }
    }
}