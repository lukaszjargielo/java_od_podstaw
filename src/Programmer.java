public class Programmer extends Employee{
    protected String languages;

    public Programmer() {
    }

    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", languages='" + languages + '\'' +
                '}';
    }
}
