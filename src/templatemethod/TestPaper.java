package templatemethod;

public abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("杨过得到,然后给了郭靖,炼成了倚天剑屠龙刀的玄铁可能是[]  a.球墨铸铁  b.马口铁 c.高速合成刚 d.碳素纤维");
        System.out.println("答案:" + getAnswer1());
    }

    public void testQuestion2() {
        System.out.println("杨过,程英铲除了情花,造成[]  a.使得该植物不再害人  b.使得一种珍稀物种灭绝 c.破坏了那个生物圈的生态平衡 " +
                "d.造成该地区沙漠化");
        System.out.println("答案:" + getAnswer2());
    }


    public void testQuestion3() {
        System.out.println("蓝凤凰致使华山师徒.桃谷六仙呕吐不止,如果你是大夫,会给他们开什么药呢? a.阿司匹林 b.牛黄解毒片 c.氟哌酸 " +
                "d.让他们喝大量的牛奶 e.以上全不对");
        System.out.println("答案:" + getAnswer3());

    }


    protected abstract String getAnswer1();

    protected abstract String getAnswer2();

    protected abstract String getAnswer3();
}
