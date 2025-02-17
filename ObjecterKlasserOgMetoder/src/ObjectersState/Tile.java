package ObjectersState;

public class Tile {
   private char letter;
   private int value;

   public Tile() {
       this.letter = '-';
       this.value = 0;
   }

    // Konstruktør til at initialisere Tile objektet
    public Tile (char letter, int value) {

        this.letter = letter;
        this.value = value;
    }

    //getter for letter
    public char getLetter() {
        return letter;
    }

    //setter for letter
    public void setLetter(char letter) {
        this.letter = letter;
    }

    //getter for value
    public int getValue() {
        return value;
    }

    //setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // printTile metode til at udskrive Tile objektets tilstand
    public static void printTile(Tile tile) {
        System.out.println("Letter: " + tile.letter + ", value: " + tile.value);
    }

    //toString for at vise Tile objektet i et læsevenligt format
    public String toString() {
        return "Tile er type Letter: " + letter + ", Value: " + value;
    }

    //equals for at sammenligne to Tile objekter
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tile tile = (Tile) obj;
        return letter == tile.letter && value == tile.value;
    }

    public static void main(String[] args) {
        Tile myTile = new Tile('Z', 10);

        printTile(myTile);

        System.out.println(myTile);

        Tile anotherTile = new Tile('Z', 10);

        System.out.println(anotherTile);

        if (myTile.equals(anotherTile)) {
            System.out.println("The tiles are equal");
        } else {
            System.out.println("The tiles are not equal");
        }
    }
}
