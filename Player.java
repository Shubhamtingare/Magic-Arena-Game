public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    // Constructor to initialize Player with health, strength, and attack attributes
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Method to get the player's name
    public String getName() {
        return this.name;
    }

    // Method to set the player's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the player's health
    public int getHealth() {
        return this.health;
    }

    // Method to calculate the damage inflicted by the player
    public int getDamage(Dice dice) {
        // Calculate damage by rolling the dice and adding the player's strength
        int damage = dice.roll() + strength;
        return damage;
    }

    // Method to apply damage to the player
    public void takeDamage(int damage) {
        this.health -= damage; // Reduce player's health by the damage amount
    }

    // Method to check if the player is alive
    public boolean isAlive() {
        return this.health > 0; // Return true if the player's health is greater than 0, otherwise false
    }
}
