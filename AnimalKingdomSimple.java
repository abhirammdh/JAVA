// Base class
class Animal {
    String name;

    void showInfo() {
        System.out.println("This is a " + name);
    }
}

// Birds
class Crow extends Animal { //extends means its a "inherits from"
    Crow() {
        name = "Crow"; // to initiate the name class Crow to Crow
    }
}
class Eagle extends Animal {
    Eagle() {
        name = "Eagle";
    }
}
class Hawk extends Animal {
    Hawk() {
        name = "Hawk";
    }
}
class Duck extends Animal {
    Duck() {
        name = "Duck";
    }
}
// Insects
class Mosquito extends Animal {
    Mosquito() {
        name = "Mosquito";
    }
}
class HouseFly extends Animal {
    HouseFly() {
        name = "House Fly";
    }
}
class Beetle extends Animal {
    Beetle() {
        name = "Beetle";
    }
}

// Rodents
class Rat extends Animal {
    Rat() {
        name = "Rat";
    }
}
class Squirrel extends Animal {
    Squirrel() {
        name = "Squirrel";
    }
}

// Reptiles
class Alligator extends Animal {
    Alligator() {
        name = "Alligator";
    }
}

// this is main class
public class AnimalKingdomSimple {
public static void main(String[] args) {
        // now this initiate the objects to  Create animal 
        Crow crow = new Crow();
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();
        Duck duck = new Duck();
// this insects
    Mosquito mosquito = new Mosquito();
    HouseFly houseFly = new HouseFly();
    Beetle beetle = new Beetle();
    Rat rat = new Rat();
    Squirrel squirrel = new Squirrel();
    Alligator alligator = new Alligator();
    crow.showInfo();
    eagle.showInfo();
    hawk.showInfo();
    duck.showInfo();
    mosquito.showInfo();
    houseFly.showInfo();
    beetle.showInfo();
    rat.showInfo();
    squirrel.showInfo();
    alligator.showInfo();
    }
}
