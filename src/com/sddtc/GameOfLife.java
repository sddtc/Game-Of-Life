package com.sddtc;

public class GameOfLife {

    public int[][] start(int[][] world) {
        for(int i = 0; i < world[0].length; i++) {
            for(int j = 0; j < world[0].length; j++) {
                bornOrDie(i, j, world);
            }
        }

        return world;
    }

    private void bornOrDie(int seedX, int seedY, int[][] world) {
        if(realAlived(seedX, seedY, 3, world)) {
            world[seedX][seedY] = 1;
        } else if(!realAlived(seedX, seedY, 2, world)) {
            world[seedX][seedY] = 0;
        }
    }

    private boolean realAlived(int seedX, int seedY, int alived, int[][] world) {
        int realAlived = 0;
        int length = world[0].length;

        for(int i = seedX-1; i <= seedX+1; i++) {
            if(ignoreIt(i, length) || ignoreIt(seedY-1, length) || ignoreIt(seedY+1, length)) {
                continue;
            }
            if(world[i][seedY-1] == 1 || world[i][seedY+1] == 1) {
                realAlived ++;
            }
        }

        if(!ignoreIt(seedX - 1, length) && world[seedX-1][seedY] == 1) {
            realAlived++;
        }

        if(!ignoreIt(seedX + 1, length) && world[seedX+1][seedY] == 1) {
            realAlived++;
        }

        return realAlived == alived;
    }

    private boolean ignoreIt(int value, int length) {
        if(value < 0 || value > (length - 1) ) {
            return true;
        }
        return false;
    }
}
