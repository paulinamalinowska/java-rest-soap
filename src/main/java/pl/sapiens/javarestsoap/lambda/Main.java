package pl.sapiens.javarestsoap.lambda;



import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNick() != null ? getNick().length(): 0);

        maybeNick()
                .map(nick -> nick.length())
                .ifPresent(integer -> System.out.println("nick length: " + integer));

        //very old java
        Lambdable oldWay = new LambdableNickImpl();

        // we don't know class name - till Java 1.7
        Lambdable anonymousWay = new Lambdable() {
            @Override
            public String getNick() {
                return "Malina";
            }
        };

        Lambdable anonymousWay2 = new Lambdable() {
            @Override
            public String getNick() {
                return "Franek";
            }
        };





        //better way
        Lambdable newWay = () -> "Maniek";
        Supplier<String> standardSupplier = () -> "Malina";
        Adult checker = (age) -> {
            System.out.println("checking....");
            return age > 18;
        };

    }



    static Optional<String> maybeNick() {
        return Optional.ofNullable(null);
    }
    static String getNick(){
        return null;
    }

}
