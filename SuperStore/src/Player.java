import java.util.ArrayList;

public class Player {
    static int balance;
    static ArrayList<Item> inventory;

    public Player(int balance) {
        Player.balance = balance;
        inventory = new ArrayList<Item>(); //create a new ArrayList for the players items
    }

    public void deductBalance(int amount) {
        balance -= amount; //remove amount from players balance
    }

    public void addItem(Item item) {
        inventory.add(item); //add item to inventory 
    }

    public void displayInventory() {
        System.out.println("---- Your Inventory ----");
        for (Item item: inventory){ //print out all field variables for the player to see the items to buy
            System.out.println("Item Name: " + item.name + ", Category: " + item.category + ", Price: $" + item.price);
        }
        System.out.println("-------------------------");

    }
}




