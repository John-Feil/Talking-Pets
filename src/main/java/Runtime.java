public class Runtime {
    public static void Run (int numberOfPets,String [] petTypes,String [] petNames) {
        Rabbit[] rabbitObjects = new Rabbit[numberOfPets];
        Dog[] dogObjects = new Dog[numberOfPets];
        Cat[] catObjects = new Cat[numberOfPets];
        Pet[] petObjects = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            if (petTypes[i].equalsIgnoreCase("Cat")) {
                catObjects[i] = new Cat();
                catObjects[i].setName(petNames[i]);
                System.out.println("Pet #" + (i + 1) + catObjects[i]);
            } else if (petTypes[i].equalsIgnoreCase("Dog")) {
                dogObjects[i] = new Dog();
                dogObjects[i].setName(petNames[i]);
                System.out.println("Pet #" + (i + 1) + dogObjects[i]);
            } else if (petTypes[i].equalsIgnoreCase("Rabbit")) {
                rabbitObjects[i] = new Rabbit();
                rabbitObjects[i].setName(petNames[i]);
                System.out.println("Pet #" + (i + 1) + rabbitObjects[i]);
            } else {
                petObjects[i] = new Pet();
                petObjects[i].setName(petNames[i]);
                petObjects[i].setType(petTypes[i]);
                System.out.println("Pet #" + (i + 1) + petObjects[i]);
            }
        }
    }
}
