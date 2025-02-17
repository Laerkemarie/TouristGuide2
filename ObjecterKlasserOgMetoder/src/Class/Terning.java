package Class;

import java.util.Random;

    public class Terning {
        int MAX = 6;
        int faceValue;
        Random randomGenerator;

        public Terning() {
            randomGenerator = new Random();
            roll();
        }

        public void roll() {
            faceValue = randomGenerator.nextInt(MAX) + 1;
        }

        public int getFaceValue() {
            return faceValue;
        }
    }

