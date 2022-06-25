package pl.sapiens.javarestsoap.stream;

import javax.json.bind.annotation.JsonbTransient;
import java.util.List;
import java.util.function.Function;

public class StreamMain {
    public static void main(String[] args) {

        //Java 6
        // List<Person> persons = new ArrayList<Person>()

        //Java 7
        // List<Person> persons = new ArrayList<>()

        //Java 9
        //var persons it's the same as List<Persons> persons - shorter - TO NIE JEST VAR JAK W JS! NIE NADPISUJE SIE TEGO
        // var persons = new ArrayList<Person>()
        // var persons; - withoud assignment it doesn't work!


        var persons = List.of(
                new Person("Paulina", "Malinowska", 29),
                new Person("Olek", "Brzuzy", 33),
                new Person("Kasia", "Kowalska", 16)

        );

       var filteredListOfName = persons.stream()
                .filter(person -> person.age() > 18)
//                .map(new Function<Person, String>() {
//                    @Override
//                    public String apply(Person person) {
//                        return person.name();
//                    }
//                })  to jest to samo co na dole
                .map(person -> {
                    String name = person.name();
                    System.out.println(name);
                    return name;
                })
//                .forEach(s -> System.out.println("name: " + s));
               .toList();

       for(var name: filteredListOfName){
           System.out.println("name: " + name);
       }

    }

}
