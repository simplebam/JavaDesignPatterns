package templatemethod;

/**
 * 模板方法模式
 */
public class Test {
    public static void main(String... args) {
        TestPaper paper = new TestPaperA();
        System.out.println(paper.getAnswer1());
        System.out.println(paper.getAnswer2());
        System.out.println(paper.getAnswer3());

        paper = new TestPaperB();
        System.out.println(paper.getAnswer1());
        System.out.println(paper.getAnswer2());
        System.out.println(paper.getAnswer3());


    }
}
