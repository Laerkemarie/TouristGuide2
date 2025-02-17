package ObjectersState;

public class TileMain {
    public static void main(String[] args) {
        Tile tile1 = new Tile();
        tile1.setLetter('Q');
        tile1.setValue(2);

        System.out.println("Letter: " + tile1.getLetter() + ", Value: " + tile1.getValue());

        Tile tile2 = new Tile();
        tile2.setLetter('U');
        tile2.setValue(6);

        System.out.println("Letter: " + tile2.getLetter() + ", Value: " + tile2.getValue());
    }
}
