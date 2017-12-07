package mediator.un;

public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA colleague1;
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country country) {
        if (USA.class.getSimpleName().equals(country.getClass().getSimpleName())) {
            colleague1.getMessage(message);
        } else if (Iraq.class.getSimpleName().equals(country.getClass().getSimpleName())) {
            colleague2.getMessage(message);

        }
    }
}
