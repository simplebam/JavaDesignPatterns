package factorymethod;

/**
 * 相加
 */
public class OperationDiv extends Operate {

    @Override
    protected String getResult() {
        return numA + numB + "";
    }


}


