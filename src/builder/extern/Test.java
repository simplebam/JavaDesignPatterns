package builder.extern;

public class Test {
    public static void main(String... args) {

        PersonBuilder builder = new PersonThinBuilder();
        PersonDirector director = new PersonDirector(builder);
        director.createPerson();


    }
}
