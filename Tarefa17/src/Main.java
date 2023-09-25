import java.util.*;

public class Main {
    public static <T extends Carro> void main(String[] args) {
        ArrayList <Carro> list = new ArrayList<>();
        Honda civic = new Honda();
        Toyota corolla = new Toyota();

        list.add(civic);
        list.add(corolla);

    }
}