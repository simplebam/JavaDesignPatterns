package factorymethod;

/**
 * 相加
 */
public class OperationAdd extends Operate {

    @Override
    protected String getResult() {
        return numA + numB + "";
    }


}


