package component.company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        displayContent(depth, name);

        for (Company c : children) {
            c.display(depth + 2);
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

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
