package com.sddtc;

public class RolesOfLife {

    public int[][] getGlider(int[][] world) {
        world[1][4] = 1;
        world[2][4] = 1;
        world[3][4] = 1;
        world[3][3] = 1;
        world[2][2] = 1;
        return world;
    }

    public int[][] getLightweightSpacecraft(int[][] world) {
        world[1][3] = 1;
        world[1][4] = 1;

        world[2][2] = 1;
        world[2][3] = 1;
        world[2][4] = 1;
        world[2][5] = 1;

        world[3][2] = 1;
        world[3][3] = 1;
        world[3][5] = 1;
        world[3][6] = 1;

        world[4][4] = 1;
        world[4][5] = 1;

        return world;
    }

    public int[][] getGliderGun(int[][] world) {
        world[5][1] = 1;
        world[5][2] = 1;
        world[6][1] = 1;
        world[6][2] = 1;

        world[6][11] = 1;
        world[5][12] = 1;
        world[6][12] = 1;
        world[7][12] = 1;

        world[4][13] = 1;
        world[5][13] = 1;
        world[6][13] = 1;
        world[7][13] = 1;
        world[8][13] = 1;

        world[3][14] = 1;
        world[4][14] = 1;
        world[8][14] = 1;
        world[9][14] = 1;

        world[4][15] = 1;
        world[5][15] = 1;
        world[6][15] = 1;
        world[7][15] = 1;
        world[8][15] = 1;

        world[4][16] = 1;
        world[8][16] = 1;
        world[5][17] = 1;
        world[7][17] = 1;
        world[6][18] = 1;

        world[4][21] = 1;
        world[2][22] = 1;
        world[3][22] = 1;
        world[5][22] = 1;
        world[6][22] = 1;

        world[1][24] = 1;
        world[7][24] = 1;

        world[1][26] = 1;
        world[2][26] = 1;
        world[4][26] = 1;
        world[6][26] = 1;
        world[7][26] = 1;

        world[11][23] = 1;
        world[12][24] = 1;
        world[10][25] = 1;
        world[11][25] = 1;
        world[12][25] = 1;

        world[3][35] = 1;
        world[3][36] = 1;
        world[4][35] = 1;
        world[4][36] = 1;

        return world;
    }
}
