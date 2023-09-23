import java.util.*;

public class Main {

    static class carro {
        void ligar() {
            System.out.println("O carro ligou");
        }
        void andar() {
            System.out.println("O carro andou");
        }
    }

    static class Honda extends carro {

    }

    static class Toyota extends carro {

    }

    public static <T extends carro> void main(String[] args) {

        ArrayList <T> list = new ArrayList<T>();
        list.add((T) new Honda());
        list.add((T) new Toyota());

    }
}