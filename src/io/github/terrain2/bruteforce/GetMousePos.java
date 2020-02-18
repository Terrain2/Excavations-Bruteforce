package io.github.terrain2.bruteforce;

import java.awt.MouseInfo;
import java.lang.Thread;

public class GetMousePos {
    public static void main (String[] args) throws InterruptedException {
        for (int i = 0; i <= 9; i++) {
            Thread.sleep(3000);
            System.out.println(MouseInfo.getPointerInfo().getLocation());
        }
    }
}