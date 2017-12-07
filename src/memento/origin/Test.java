package memento.origin;

/**
 * 备忘录模式
 */
public class Test {
    public static void main(String... args) {

        Originator originator = new Originator();
        originator.setState("On");
        originator.show();


        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
