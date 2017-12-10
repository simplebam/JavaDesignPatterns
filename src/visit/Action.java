package visit;

public abstract class Action {
    //得到男人结论或者反应
    public abstract void getManConclusion(Man concreteElementA);

    //得到女人结论或者反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}
