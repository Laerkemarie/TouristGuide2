package dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getAge() {
        Dog dog = new Dog(4, "Lise");
        Dog dog1 = new Dog(1, "Hans");
        assertEquals(11, dog.getAge());
        assertEquals(8, dog1.getAge());
    }
}