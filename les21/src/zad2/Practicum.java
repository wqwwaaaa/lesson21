package zad2;

@FunctionalInterface
interface Summator {
    int sum(int n1, int n2);
}

public class Practicum {

    public static void main(String[] args) {
        Summator summator = (n1, n2) -> n1 + n2;
        System.out.println("Сумма 23 и 65 равна " + summator.sum(23, 65));
    }
}