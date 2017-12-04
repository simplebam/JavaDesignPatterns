package adapter.basketball;

public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后锋"+name+"进攻,English");
    }

    @Override
    public void defense() {
        System.out.println("后锋"+name+"防守,English");
    }
}
