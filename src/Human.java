public class Human implements payable, Comparable<Human> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Human() {
        this.id = idCounter++;
    }

    public Human(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Human other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
 }

