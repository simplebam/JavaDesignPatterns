package factorymethod;


public class DivFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new OperationDiv();
    }
}
