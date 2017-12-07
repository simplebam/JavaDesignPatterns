package mediator.un;

/**
 * 中介者模式
 */
public class Test {
    public static void main(String... args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA colleague1 = new USA(UNSC);
        Iraq colleague2 = new Iraq(UNSC);

        UNSC.setColleague1(colleague1);
        UNSC.setColleague2(colleague2);

        colleague1.declare("不可以研制核武器,否则要发动战争");
        colleague2.declare("我们没有核武器,但也不怕被侵略");


    }
}
