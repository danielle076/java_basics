## If then

The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true.

    package K_IfThen;
    
    public class Main {
    
        public static void main(String[] args) {
            // = is an assignment operator
            // == asks if the operands (isAlien) are identical or equal to each other
            boolean isAlien = false;
            if (isAlien == false) // important: if statement doesn't have ';'. It doesn't give an error message if you do
                System.out.println("It is not an alien"); // It is not an alien
    
            boolean isMonster = false;
            if (isMonster == true)
                System.out.println("It is not a monster"); // doesn't print this out
            System.out.println("I'm scared of monsters"); // print this, even though == is true (it shouldn't print anything)
            // with a codeblock {} he looks at both lines, now only at the first one and prints the second
    
            // if you use codeblock {} he won't print out both lines
            boolean isGhost = false;
            if (isGhost == true) {
                System.out.println("It is not a ghost");
                System.out.println("I'm scared of ghosts");
            }
        }
    }