public class Clients {

    private final String name;
    private final String surename;
    private final String useTariff;
    private final int age;


    public Clients(String name, String surename, int age, String useTariff) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.useTariff = useTariff;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clients{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surename='").append(surename).append('\'');
        sb.append(", age=").append(age);
        sb.append(", useTariff='").append(useTariff).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

