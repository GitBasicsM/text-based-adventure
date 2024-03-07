import java.util.Scanner;

public class TextBasedAdventure {
    boolean hasSword = false;
    boolean hasNerfGun = false;
    boolean hasRocketLauncher = false;
    Scanner keyboardInput = new Scanner(System.in);

    public void execute() {
        System.out.println("Welcome to Escape from the Cave! Press enter when you are ready to start...");
        keyboardInput.nextLine();
        System.out.println("You are trapped in a cave!");
        start();
    }

    public void start() {
        System.out.println("You find yourself in a large room. What would you like to do?\n1. Go left \n2. Go right \n3. Go hide in the corner \n 4. DARK MEME");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            goLeft();
        }
        else if (input == 2) {
            goRight();
        }

        else if (input == 31){

            CheatCode();
        }
        else if (input == 3){
            System.out.println("Hey I know you are scared but let me help you out try typing in 31!");
            start();
        }

        else if (input == 4){
            System.out.println("            _.------.                        .----.__\r\n" + //
                                "           /         \\_.       ._           /---.__  \\\r\n" + //
                                "          |  O    O   |\\\\___  //|          /       `\\ |\r\n" + //
                                "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\r\n" + //
                                "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\r\n" + //
                                "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\r\n" + //
                                "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\r\n" + //
                                "      /   / |         \\        /  | | ~   \\          |  \\\\\r\n" + //
                                "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\r\n" + //
                                "       `'   |  _     |  `._/' |   |  \\     7        /\r\n" + //
                                "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\r\n" + //
                                "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\r\n" + //
                                " --'                  \\  \\ |   /    |  |              `-\r\n" + //
                                "                       \\uU \\UU/     |  /   :F_P:");
    
        }
    }

    public void CheatCode() {

        System.out.println("You WIN! BYE BYE GO HOME!");
    }

    public void goLeft() {
        System.out.println("Oh no! You run into a giant! Fight or flight?\n1. Fight \n2. Flight \n3. Quit \n4. Talk");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            fight();
        }
        else if (input == 2) {
            System.out.println("Wow you are such a baby, grow up!");
            start();
        }  
        else if (input == 4) {
            System.out.println("Yo can we just talk?");
           fight();
        }
        else{
            System.out.println("Damn you going to quit just like that???? get back in there!");
            goLeft();
        }
    }

    public void goRight() {
        if (!hasSword) {
            System.out.println("You find a sword on the ground!");
            hasSword = true;
        }
        else if (hasSword) {
            hasNerfGun = true;
        System.out.println("Wow you picked up a NerfGun");
        }
        else if (!hasRocketLauncher){
            hasRocketLauncher = true;
            System.out.println("you picked up a Rocketlauncher, it's heavy");
           
        } else{
            System.out.println("There is nothing here...");
        }
        start();
    }

    public void fight() {
        if (hasSword) {
            System.out.println("You defeat the giant with your sword and run out of the cave!");
        } else if (hasNerfGun) {
           System.out.println(" Your Nerf Elite Dart bounces off the Monsters chest, you get decapitated");
        }else if (hasRocketLauncher){
            System.out.println("You pull out your Rocketlauncher but end up blowing yourself up because it was too heavy.");
        }
        else{
            System.out.println("You get stomped by the giant and red stuff goes everywhere.");
        }
    }


    public static void main(String[] args) {
        new TextBasedAdventure().execute();
    
    }
}
