package decorate;

public class TrainedMan extends Coder {

    private Coder coder;

    public TrainedMan(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void code() {
        if (coder != null) {
            coder.code();
        }
        System.out.println("大数据");
    }
}
