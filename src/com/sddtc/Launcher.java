package com.sddtc;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Launcher {
    public static int length = 80;
    public static int gap = 8;
    public static int dimension = length * gap;
    private static int[][] world = new int[length][length];

    public static void main(String[] args) throws IOException, InterruptedException {
//        world = new RolesOfLife().getGlider(world);
//        world = new RolesOfLife().getLightweightSpacecraft(world);
        world = new RolesOfLife().getGliderGun(world);

        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GameOfLifeCanvas lifeCanvas = new GameOfLifeCanvas(world, gap);
        lifeCanvas.setPreferredSize((new Dimension(dimension, dimension)));
        lifeCanvas.setBackground(Color.BLACK);
        mainFrame.getContentPane().add(lifeCanvas);

        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}

