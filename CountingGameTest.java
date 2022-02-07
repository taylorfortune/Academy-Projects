import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CountingGameTest {
    CountingGame

    @BeforeEach
    void setUp() {
        CountingGame = new game();
    }
    @Test
    void getnumber() {
        Object message;
        assertEquals("Name",game.getnumber(),message);
    }
    @Test
    void getnumber() {
        assertEquals(game.getnumber(), message);
    }

    @Test
    void getnumber() {
        assertEquals(game.getnumber(), message);
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");
    }
    @AfterAll
    void tearDown() {
        System.out.println("You have won the game and guess the right number");
    }
}