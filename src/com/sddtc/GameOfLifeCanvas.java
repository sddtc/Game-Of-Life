package com.sddtc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameOfLifeCanvas extends JPanel {
    private int[][] world;
    private int gap;
    private int ALIVED = 1;

    public GameOfLifeCanvas(int[][] world, int gap) {
        this.world = world;
        this.gap = gap;

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.world = new GameOfLife().start(this.world);

        for(int i = 0; i < world.length; i++) {
            for(int j = 0; j < world[0].length; j++) {
                if(world[i][j] == ALIVED) {
                    g.setColor(Color.ORANGE);
                    g.fillRect(j*gap, i*gap, gap,gap);
                }
            }
        }
    }
}
