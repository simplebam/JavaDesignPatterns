package adapter.basketball;

public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋"+name+"进攻,English");
    }

    @Override
    public void defense() {
        System.out.println("前锋"+name+"防守,English");
    }
}
