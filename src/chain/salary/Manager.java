package chain.salary;

public abstract class Manager {
    protected String name;
    //管理者的上一级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior=superior;
    }

    public abstract void reqeustApplication(Request request);
}
