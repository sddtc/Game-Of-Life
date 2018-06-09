package com.sddtc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameOfLifeCanvas extends JPanel {
    private int[][] world;
    private int gap;

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

        for(int i = 0; i < world[0].length; i++) {
            for(int j = 0; j < world[0].length; j++) {
                if(world[i][j] == 1) {
                    g.fillRect(i*gap, j*gap, gap,gap);
                } else if(world[i][j] == 0) {
                    g.drawRect(i*gap, j*gap, gap,gap);
                }
            }
        }
    }
}
