package adapter.iphonex;

public class AdapterImpl implements ThreePlugs {
    private TwoPlugs twoPlugs;

    public AdapterImpl(TwoPlugs twoPlugs) {
        this.twoPlugs = twoPlugs;
    }

    @Override
    public void chargeWithThreePlugs() {
        System.out.println("使用组合的方式实现兼容充电");
        twoPlugs.chargeWithTwoPlugs();
    }
}
