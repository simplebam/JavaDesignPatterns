package component.base;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子没有这个节点");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶子没有这个节点");
    }

    @Override
    public void display(int depth) {
        String content = "";
        for (int i = 0; i < depth; i++) {
            content += ",";
        }
        content += name;
        System.out.println(content);
    }
}
