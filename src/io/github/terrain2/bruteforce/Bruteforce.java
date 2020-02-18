package io.github.terrain2.bruteforce;
import java.awt.event.InputEvent;
import java.awt.Robot;
import java.lang.Integer;
import java.lang.Thread;

public class Bruteforce {

    public static void main(String[] args) throws InterruptedException {
        Robot bot = null;
        try {
            bot = new Robot();
        } catch (Exception failed) {
            System.err.println("Failed instantiating Robot" + failed);
            return;
        }
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        for (int i = 0; i <= 9999; i++) {
            if (i == 2408 || i == 7685) continue;
            Thread.sleep(5);
            StringBuilder s = new StringBuilder(Integer.toString(i));
            while (s.length() < 4) {
                s.insert(0, "0");
            }
            String[] a = s.toString().split("");
            for (int j = 0; j < 4; j++) {
                int x = 0;
                int y = 0;
                switch (a[j]) {
                    case "0":
                        x = 961;
                        y = 711;
                        break;
                    case "1":
                        x = 853;
                        y = 338;
                        break;
                    case "2":
                        x = 958;
                        y = 354;
                        break;
                    case "3":
                        x = 1085;
                        y = 365;
                        break;
                    case "4":
                        x = 844;
                        y = 484;
                        break;
                    case "5":
                        x = 962;
                        y = 480;
                        break;
                    case "6":
                        x = 1073;
                        y = 474;
                        break;
                    case "7":
                        x = 854;
                        y = 591;
                        break;
                    case "8":
                        x = 960;
                        y = 596;
                        break;
                    case "9":
                        x = 1065;
                        y = 598;
                        break;
                    default:
                        return;
                }
                bot.mouseMove(x, y);
                bot.mousePress(mask);
                bot.mouseRelease(mask);
            }
        }
    }
}
