package ImperativeToFunctionalStyle;

import java.util.List;

public class ConvertingForeachWithIf {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "Paula", "Kate", "Peter");
        //Type 1
        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(name -> System.out.println(name));
        names.stream().forEach(System.out::println);

        //Type 2
        for (String name : names) {
            if (name.length() == 4) {
                System.out.println(name);
            }
        }

        names.stream().filter(i->i.length()==4).forEach(System.out::println);
    }
}
