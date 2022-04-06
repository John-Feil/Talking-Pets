import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private int numberOfPets;
    String[] petTypes;
    String[] petNames;

    public void takeInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        this.numberOfPets = userInput.nextInt();
        userInput.nextLine();
        petTypes = new String[this.numberOfPets];
        petNames = new String[this.numberOfPets];

        String temp = "";
        for (int i = 0; i < this.numberOfPets;i++){
            System.out.println("What kind of pet is number " + (i+1) + "?");
            temp = userInput.nextLine();
            petTypes[i] = temp;
            System.out.println("What's pet number " + (i+1) + "'s name?");
            temp = userInput.nextLine();
            petNames[i] = temp;
        }
    }

    public String[] getPetTypes() {
        return Arrays.copyOf(petTypes,petTypes.length);
    }

    public String[] getPetNames() {
        return Arrays.copyOf(petNames,petNames.length);
    }

    public int getNumberOfPets() {
        return this.numberOfPets;
    }
}
