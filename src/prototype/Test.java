package prototype;

/**
 * 原型模式
 */
public class Test {
    public static void main(String... args) {
        Resume resume = new Resume("林志玲");
        resume.setPersonInfo("女", "43");
        resume.setWorkExperience("2007-10-1", "xxx公司");

        System.out.println("克隆前:");
        System.out.println("resume:    " + resume);


        Resume cloneResume = (Resume) resume.clone();
        cloneResume.setPersonInfo("男", "0");
        cloneResume.setWorkExperience("唐朝","大唐皇朝");

        System.out.println("克隆后--------------");
        System.out.println("resume:    " + resume);
        System.out.println("cloneResume:   " + cloneResume);

    }
}
