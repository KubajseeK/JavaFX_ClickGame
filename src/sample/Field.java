package sample;

import java.util.Random;

public class Field {
    private Tile[][] tiles;
    Random rn = new Random();

    public void incrementTile(int a, int b) {
        tiles[a][b].setValue(tiles[a][b].getValue() + 1);
    }
    public void decrementTile(int a, int b) {
        tiles[a][b].setValue(tiles[a][b].getValue() - 1);
    }

    public Field() {
        initTiles();
    }


    public String getTile(int i, int j) {
        return Integer.toString(tiles[i][j].getValue());
    }
    private void initTiles() {
        tiles = new Tile[4][4];
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j] = new Tile(rn.nextInt(6) + 5);

            }

        }
    }
}
