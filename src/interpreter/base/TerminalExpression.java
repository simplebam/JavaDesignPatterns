package interpreter.base;

public class TerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context content) {
        System.out.println("终端解释器");
    }
}
