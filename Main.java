package test.src;
// Save as src/Main.java

public class Main {
    public static void main(String[] args) {
        Player1 playerA = new Player(50, 5, 10);
        Player1 playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.startBattle();
    }
}
