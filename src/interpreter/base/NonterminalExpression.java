package interpreter.base;

public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context content) {
        System.out.println("非终端解释器");
    }
}
