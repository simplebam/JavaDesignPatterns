package adapter.iphonex;

public class IPhoneX {

    private ThreePlugs threePlugs;

    public IPhoneX(ThreePlugs threePlugs) {
        this.threePlugs = threePlugs;
    }

    public void charge() {
        threePlugs.chargeWithThreePlugs();
    }
}
