public class Teacher extends Person{

    private String abscription;
    private int bioCard;
    private int assignedHours;

    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Teacher(String name, String lastName, String email, String address, String abscription, int bioCard, int assignedHours) {
        super(name, lastName, email, address);
        this.abscription = abscription;
        this.bioCard = bioCard;
        this.assignedHours = assignedHours;
    }

    public String getAbscription() {
        return abscription;
    }

    public void setAbscription(String abscription) {
        this.abscription = abscription;
    }

    public int getBioCard() {
        return bioCard;
    }

    public void setBioCard(int bioCard) {
        this.bioCard = bioCard;
    }

    public int getAssignedHours() {
        return assignedHours;
    }

    public void setAssignedHours(int assignedHours) {
        this.assignedHours = assignedHours;
    }

    public String toString(){
        return ("La profesora " + getName() + " " + getLastName() +
                "\n con BioCard " + getBioCard() +
                "\n Encargada del area " + getAbscription() +
                "\n Con " + getAssignedHours() + " horas a la semana " +
                "\n con correo electrinico " + getEmail() +
                "\n Y direccion " + getAddress());
    }

    public String soy() {
        return "soy una persona y maestro";
    }
}
