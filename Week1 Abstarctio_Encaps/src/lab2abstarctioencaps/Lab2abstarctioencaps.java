package lab2abstarctioencaps;

interface Animal {
    // Abstract method (does not have a body)

    public abstract void animalSound();
    // Regular method

    public abstract void sleep();
}

// Subclass (inherit from Animal)
class cat implements Animal {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: meow");
    }

    public void sleep() {
        // The body of animalSound() is provided here
        System.out.println("zzz");
    }
}

class dog implements Animal {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: bark");
    }

    public void sleep() {
        // The body of animalSound() is provided here
        System.out.println("zzz");
    }
}

class Main {

    public static void main(String[] args) {
        cat mycat = new cat(); // Create a Pig object
        mycat.animalSound();
        mycat.sleep();

        dog mydog = new dog(); // Create a Pig object
        mydog.animalSound();
        mydog.sleep();
    }
}
