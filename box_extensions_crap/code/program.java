@FunctionalInterface
interface Printer {
    void print(String msg);
}

public class Main {
    public static void main(String[] args) {
        Printer printer = (String msg) -> {
            System.out.println(msg);
        };

        printer.print("Hello, world!");
    }
}
