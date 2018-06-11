package com.sddtc;

public class GameOfLife {

    public int[][] start(int[][] world) {
        int[][] newWorld = new int[world.length][world[0].length];

        for(int x = 0; x < world.length; x++) {
            for(int y = 0; y < world[0].length; y++) {
                bornOrDie(x, y, world, newWorld);
            }
        }

        return newWorld;
    }

    private void bornOrDie(int seedX, int seedY, int[][] world, int[][] newWorld) {
        if((realAlived(seedX, seedY, world) < 2) || (realAlived(seedX, seedY, world) > 3)) {
            if(world[seedX][seedY] == 1) {
                newWorld[seedX][seedY] = 0;
            }
        } else if(realAlived(seedX, seedY, world) == 3) {
            newWorld[seedX][seedY] = 1;
        } else if(realAlived(seedX, seedY, world) == 2) {
            if(world[seedX][seedY] == 1) {
                newWorld[seedX][seedY] = 1;
            }
        }
    }

    private int realAlived(int seedX, int seedY, int[][] world) {
        int realAlived = 0;
        int width = world[0].length;
        int height = world.length;

        if(seedX > 0 && seedX < (width - 1)) {
            if(seedY > 0 && seedY < (height - 1)) {
                if(world[seedX-1][seedY-1] == 1) {
                    realAlived++;
                }
                if(world[seedX-1][seedY] == 1) {
                    realAlived++;
                }
                if(world[seedX-1][seedY+1] == 1) {
                    realAlived++;
                }

                if(world[seedX][seedY-1] == 1) {
                    realAlived++;
                }
                if(world[seedX][seedY+1] == 1) {
                    realAlived++;
                }

                if(world[seedX+1][seedY-1] == 1) {
                    realAlived++;
                }
                if(world[seedX+1][seedY] == 1) {
                    realAlived++;
                }
                if(world[seedX+1][seedY+1] == 1) {
                    realAlived++;
                }
            }
        }

        return realAlived;
    }
}
