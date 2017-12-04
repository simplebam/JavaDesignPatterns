package component.company;

public class HRDepartment extends Company {


    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        displayContent(depth, name);

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
        System.out.println(name + "员工招聘培训管理");
    }
}
