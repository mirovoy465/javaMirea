package part21.ex2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        MagicChairFactory magicChairFactory = new MagicChairFactory();
        MagicChair magicChair = magicChairFactory.create();
        client.sit(magicChair);
    }
}
