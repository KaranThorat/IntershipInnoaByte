package test.src;


// Save as src/Arena.java

public class Arena {
    private Player1 player1;
    private Player1 player2;

    public Arena(Player1 player1, Player1 player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startBattle() {
        Player1 attacker, defender;
        if (player1.getHealth() < player2.getHealth()) {
            attacker = player1;
            defender = player2;
        } else {
            attacker = player2;
            defender = player1;
        }

        while (attacker.isAlive() && defender.isAlive()) {
            executeTurn(attacker, defender);

            // Swap roles for the next turn
            Player1 temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (attacker.isAlive()) {
            System.out.println("Player with health " + attacker.getHealth() + " wins!");
        } else {
            System.out.println("Player with health " + defender.getHealth() + " wins!");
        }
    }

    private void executeTurn(Player1 attacker, Player1 defender) {
        int attackValue = attacker.attack();
        int defenseValue = defender.defend();
        int damage = attackValue - defenseValue;

        if (damage > 0) {
            defender.setHealth(defender.getHealth() - damage);
            System.out.println("Attacker deals " + damage + " damage. Defender's health is now " + defender.getHealth());
        } else {
            System.out.println("Defender blocks the attack. No damage taken.");
        }
    }
}
