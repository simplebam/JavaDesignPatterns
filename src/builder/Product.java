package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String string) {
        parts.add(string);
    }

    public void show() {
        for (String s : parts) {
            System.out.print(s + "  ,");
        }

        System.out.println();
    }


}
