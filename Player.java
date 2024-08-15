package test.src;

// Save as src/Player.java
public class Player implements Player1 {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    @Override
    public int attack() {
        return rollDice() * attack;
    }

    @Override
    public int defend() {
        return rollDice() * strength;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
