package proxy;

public class Pursuit implements IGivegift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + ",我要送你Dolls");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + ",我要送你Flowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + ",我要送你Chocolate");
    }
}
