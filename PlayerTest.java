package test;

import test.src.Player;
import test.src.Test;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    private void assertEquals(int i, Object health) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testPlayerAttack() {
        Player player = new Player(50, 5, 10);
        int attackValue = player.attack();
        assertTrue(attackValue >= 10 && attackValue <= 60);
    }

    private void assertTrue(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    public void testPlayerDefend() {
        Player player = new Player(50, 5, 10);
        int defenseValue = player.defend();
        assertTrue(defenseValue >= 5 && defenseValue <= 30);
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player(50, 5, 10);
        player.setHealth(30);
        assertEquals(30, player.getHealth());
    }
}
