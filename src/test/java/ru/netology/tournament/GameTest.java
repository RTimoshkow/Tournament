package ru.netology.tournament;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.Player;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game player = new Game();

    private Player p1 = new Player(5, "Roman", 10);
    private Player p2 = new Player(4, "Nikita", 4);
    private Player p3 = new Player(3, "Andrey", 7);
    private Player p4 = new Player(2, "Sasha", 6);
    private Player p5 = new Player(1, "Ira", 2);

    @BeforeEach
    void setup() {
        player.addPlayer(p1);
        player.addPlayer(p2);
        player.addPlayer(p3);
        player.addPlayer(p4);
        player.addPlayer(p5);
    }

    @Test
    public void shouldFindAll() {
        Player[] actual = player.findAll().toArray(new Player[0]);
        Player[] expected = new Player[] {p1, p2, p3, p4, p5};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldCheckingRegistration() {

        boolean actual = false;
        boolean expected = player.register(new Player());

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWhoWin() {

        int actual = 2;
        int expected = player.round("Ira", "Roman");

        assertEquals(actual, expected);
    }

}