package memento.game;

/**
 * 备忘录模式
 */
public class Test {
    public static void main(String... args) {

        GameRole currentGame = new GameRole();
        currentGame.initState();
        System.out.println("大战前夕:------------------------");
        currentGame.stateDisplay();
        RoleStateMemento roleStateMemento = currentGame.saveState();


        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(roleStateMemento);


        currentGame.fight();
        System.out.println("大战过后:========================");
        currentGame.stateDisplay();


        System.out.println("恢复状态之后:");
        currentGame.recoveryState(roleStateCaretaker.getRoleStateMemento());
        currentGame.stateDisplay();
    }
}
