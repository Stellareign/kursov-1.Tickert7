public class Afftor {
    private String afftorName;
    private String afftorSurname;

    public Afftor(String afftorName, String afftorSurname) {
        this.afftorName = afftorName;
        this.afftorSurname = afftorSurname;
    }

    @Override
    public String toString() {
        return "Имя автора: " + afftorName + " " + afftorSurname + ".";
    }
}
