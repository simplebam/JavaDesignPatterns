package factorymethod;


public class AddFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new OperationAdd();
    }
}
