package com.example.demo.mondai;

import org.junit.jupiter.api.Test;

public class LoopTest {

    @Test
    void mondai1() {
        int size = 5;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void mondai2() {
        int size = 5;
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void mondai3() {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void diagonal() {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print((col == row) ? "*" : " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void checker() {
        int size = 8;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(((row + col) % 2 == 0) ? "* " : "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void cross() {
        int size = 5;
        int mid = size / 2;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print((row == mid || col == mid) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    @Test
    void x() {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print((col == row || col == size - row - 1) ? "*" : " ");
            }
            System.out.println();
        }
    }

    @Test
    void pyramid() {
        int size = 3;
        int totalColumns = size * 2 - 1;
        for (int row = 0; row < size; row++) {
            int stars = row * 2 + 1;
            int leftSpaces = (totalColumns - stars) / 2;
            int rightSpaces = totalColumns - leftSpaces - stars;
            for (int i = 0; i < leftSpaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < rightSpaces; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    

    @Test
    void v() {
        int size = 4;
        int totalColumns = size * 2 - 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < totalColumns; col++) {
                System.out.print((col == row || col == totalColumns - 1 - row) ? "*" : " ");
            }
            System.out.println();
        }
    }

    @Test
    void test(){
        //3×3の*のマスを作成する
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
