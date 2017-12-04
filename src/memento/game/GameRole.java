package memento.game;

public class GameRole {

    public int vit;
    public int atk;
    public int def;

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento roleStateMemento) {
        this.vit = roleStateMemento.vit;
        this.atk = roleStateMemento.atk;
        this.def = roleStateMemento.def;
    }


    public void stateDisplay() {
        System.out.println("角色当前状态:");
        System.out.println("体力:" + this.vit);
        System.out.println("攻击力:" + this.atk);
        System.out.println("防御力:" + this.def);
    }


    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

}
