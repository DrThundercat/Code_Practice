package Practice.Problem5;

import java.util.Arrays;

 class Kata5 {

    static int peakHeight(char [][] mountain) {

        int currentHeight   = 0;
        int maxHeight       = Integer.max(mountain.length, mountain[0].length) / 2;
        boolean mapComplete = false;

        int[][] mountainHeights = new int[mountain.length][mountain[0].length];

        // build integer representation of character array, -1 for ^
        for (int row = 0; row < mountain.length; row++) {
            for (int col = 0; col < mountain[0].length; col++) {
                mountainHeights[row][col] = (mountain[row][col] == '^') ? -1 : 0;
            }
        }

        while (mapComplete == false && currentHeight <= maxHeight) {
            mapComplete = true;
            currentHeight++;

            for (int row = 0; row < mountainHeights.length; row++) {
                for (int col = 0; col < mountainHeights[0].length; col++) {
                    if (mountainHeights[row][col] != -1) {
                        continue;
                    }

                    mapComplete = false;

                    // boundary check, only on first full loop
                    if (currentHeight == 1 && (row == 0 | row == mountain.length - 1 | col == 0 | col == mountain[0].length - 1)) {
                        mountainHeights[row][col] = 1;
                        continue;
                    }

                    // check cardinal directions
                    if ((mountainHeights[row - 1][col] == currentHeight - 1) |
                            (mountainHeights[row + 1][col] == currentHeight - 1) |
                            (mountainHeights[row][col - 1] == currentHeight - 1) |
                            (mountainHeights[row][col + 1] == currentHeight - 1)) {
                        mountainHeights[row][col] = currentHeight;
                    }
                }
            }
        }

        return currentHeight - 1;
    }
}
