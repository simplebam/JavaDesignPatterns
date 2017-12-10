package interpreter.base;

import java.util.ArrayList;

/**
 * 解释器模式
 */
public class Test {
    public static void main(String... args) {

        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());


        for (AbstractExpression ab:list) {
            ab.interpret(context);
        }

    }
}
