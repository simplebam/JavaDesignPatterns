package adapter.basketball;

public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋"+name+"进攻,English");
    }

    @Override
    public void defense() {
        System.out.println("中锋"+name+"防守,English");
    }
}
