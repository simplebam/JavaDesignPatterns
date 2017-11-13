package prototype;

public class Work {

    private String timeArea;
    private String company;

    public Work(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Work{" +
                "timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
