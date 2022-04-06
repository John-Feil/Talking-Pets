public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.takeInput();
        Runtime.Run(input.getNumberOfPets(), input.getPetTypes(), input.getPetNames());
    }
}
