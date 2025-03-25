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
}
