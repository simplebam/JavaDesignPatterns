package factorymethod;


public class MulFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new OperationMul();
    }
}
