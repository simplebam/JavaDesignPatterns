package factorymethod;


public class SubFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new OperationSub();
    }
}
