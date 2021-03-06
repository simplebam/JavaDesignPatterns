package prototype;


import java.io.*;

public class Resume implements Cloneable {
    private String name;
    private String age;
    private String sex;
    private Work work;


    public Resume(String name) {
        this.name = name;

    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        if (work == null) {
            work = new Work(timeArea, company);
        } else {
            work.setCompany(company);
            work.setTimeArea(company);
        }

    }


    @Override
    protected Object clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();   //浅克隆
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }


    /**
     * 利用流来进行深度克隆:https://www.cnblogs.com/Qian123/p/5710533.html
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", work=" + work +
                '}';
    }
}
