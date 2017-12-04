package component.base;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        displayContent(depth, name);

        for (Component c : children) {
            c.display(depth+2);
        }
    }

    private void displayContent(int depth, String name) {
        String content = "";
        for (int i = 0; i < depth; i++) {
            content += ",";
        }
        content += name;
        System.out.println(content);
    }
}
