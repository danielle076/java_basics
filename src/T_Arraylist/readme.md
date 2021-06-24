## ArrayList

The ArrayList (class) is a resizable array.

#### Create an ArrayList

Object is called `sweet` that will store Strings.

    import java.util.ArrayList; // import the ArrayList class
    
    ArrayList<String> sweet = new ArrayList<String>(); // Create an ArrayList object

#### Add items

The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the `add()` method.

    import java.util.ArrayList;
    
    public class Main {
        public static void main(String[] args) {
            ArrayList<String> sweets = new ArrayList<String>();
            sweets.add("chocolate");
            sweets.add("lollipop");
            sweets.add("dessert");
            sweets.add("candy");
            System.out.println(sweets);
        }
    }

#### Access an item

To access an element in the ArrayList, use the `get()` method and refer to the index number.

    sweets.get(0);

#### Change an item

To modify an element, use the `set()` method and refer to the index number.

    sweets.set(0, "Opel");

#### Remove an item

To remove an element, use the `remove()` method and refer to the index number.

    sweets.remove(0);

#### ArrayList size

To find out how many elements an ArrayList have, use the `size()` method.

    sweets.size();

## Array vs ArrayList

- Arrays are used when you know the length of the collection in advance.
- Do you not know the length in advance or do you need a variable length for your collection? Then use ArrayLists

An array is basic functionality provided by Java. ArrayList is part of collection framework in Java. Therefore array members are accessed using `[]`, while ArrayList has a set of methods to access elements and modify them.

## Example 

<i>GroceryList.java</i>

Step 1: access our array list: define the type and then the variable name (private ArrayList), then we use  <>. Between <> you put the type of data that is going into the ArrayList, String. We call it groceryList.

    private ArrayList<String> groceryList = new ArrayList<String>();

Step 2: create method to add a grocery item.

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

Step 3: method to print the grocery list.

`.size()` will return how many elements we currently have stored in the arraylist.

Access a particular element, we use `.get()`.

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {            
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

Step 4: method to modify (replace an item) in the arraylist.

With `.set` we replace an item in that position.

Using position + 1. Humans start counting from 1, but the computer always starts at 0 with its count.

    public void modifyGroceryItem(int position, String newItem) {    
        groceryList.set(position, newItem);    
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

Step 5: method to remove an item.

We're going to retrieve the item first so we can output it and tell people what item has been modified, and we do that with `groceryList.get(position)`.

`groceryList.remove(position);` removes an item at that position

    public void removeGroceryItem(int position) {    
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }


Step 6: method to `findItem` in the Arrarylist.

The indexOf() method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element return a number corresponding to the index position in our ArrayList.

If that number returned greater than equal to 0 we need to return it otherwise if it's not greater than equal to 0 it means it has to be less than zero it is going to return null.

    public String findItem(String searchItem) {    
        int position = groceryList.indexOf(searchItem);    
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

<i>Main.java</i>

Step 7: adding Scanner.

    private static Scanner scanner = new Scanner(System.in);

Step 8: adding the GroceryList.

    private static GroceryList groceryList = new GroceryList();

Step 9, 10 and 11: main method.

Creating variables `quit` and `choice`.

Adding a while loop.

Use switch: the methods are listed.

    public static void main(String[] args) {    
        boolean quit = false;
        int choice = 0;
    
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

Step 12: method `printInstructions`.

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

Step 13: method `addItem`.

What the user has typed we are going to add that as an item to the groceryList.

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");        
        groceryList.addGroceryItem(scanner.nextLine());
    }

Step 14: method `modifyItem`.

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();        
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

Why -1? An array starts at 0, so to access the right number -1.

Step 15: method `removeItem`.

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

Step 16: method `searchForItem`.

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();        
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

!= means not equal to

## Challenge 1

Given: a list of names without capital letters of customers.

Task: A lazy intern put all the customers in the system, but he couldn't find the Shift button.

It's up to you to capitalize all the names at the beginning. Create a method that receives a List as a parameter and then capitalizes the contents.

Bonus 1: Make sure that insertions are not capitalized.<br/>
Bonus 2: Make sure the first letter after a `-` does get capitalized.

    import java.util.ArrayList;
    import java.util.List;
    
    public class CapitalLetters {
    
        public static void main(String[] args) {
            List<String> curstomerNames = new ArrayList<>();
    
            curstomerNames.add("nick piraat");
            curstomerNames.add("michael jackson");
            curstomerNames.add("glennis grace");
            curstomerNames.add("dreetje hazes");
            curstomerNames.add("robbie williams");
            curstomerNames.add("michiel de ruyter");
            curstomerNames.add("sjaak polak");
            curstomerNames.add("jan van jansen");
            curstomerNames.add("henk den hartog");
            curstomerNames.add("mo el-mecky");
            curstomerNames.add("fredje kadetje");
        }
    }

## Challenge 2

Write a method that receives a List<Integer>.

Check in the method if this list has 3 entries.

If it does not: return the error message, "There are too many or too few numbers in the list."

BONUS: Can you create an error message for too many and an error message for too few?

When there are as many as three numbers in it, return the following:
A list of numbers sorted from low to high.

You may not use `Collections.sort` or `java.streams` here.

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class SortList {
    
        public static void main(String[] args) {
    
            List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
            List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        }
    }

## Challenge 3

Copy the code below and answer questions 1 to 6.

    import java.util.ArrayList;
    import java.util.List;
    
    public class ListOefening {
    
        public static void main(String[] uitlegList) {
    
            // We have a list that includes the names of soccer clubs
            List<String> clubNames = new ArrayList<>();

            clubNames.add("Ajax");
            clubNames.add("PSV");
            clubNames.add("Feyenoord");
            clubNames.add("Fc Utrecht");
            clubNames.add("Fc Groningen");
            clubNames.add("FC Twente");
    
            // Question 1: Create a method whose task is to print out the list by line
    
            // Question 2: Create a method whose task is to print the list: position + content
            // The above list would then be this:
            // 0 - Ajax
            // 1 - PSV
            // etc...
    
            // Question 3: Create a method that checks if a club is already in the list and add it otherwise
    
            // Question 4: Create a method that returns the position of the club in the list
    
            // Question 5: Create a method that sorts the list alphabetically. If Ajax is not in position 1, the clubs that are in front of Ajax should be removed
            // We add some more clubs to test the code
            clubNames.add("AA Aachen");
            clubNames.add("AFC Amsterdam");
            clubNames.add("AFC");
    
            // Question 6: Can you do the same as above, but PSV should be last in that case
            clubNames.add("Zlotty FC");
            clubNames.add("SC Eindhoven");
        }
    }