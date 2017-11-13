package factorymethod;

/**
 * 相减
 */
public class OperationSub extends Operate {

    @Override
    protected String getResult() {
        return numA -numB + "";
    }


}


