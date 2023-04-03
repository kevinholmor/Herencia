public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Juan", "Perez", "Juanpi@gmail.com", "Conocido en Iguala Gro");

        Teacher teacher1 = new Teacher("Maria", "Morales", "maria@gmail.com", "Ruffo Figueroa");

        System.out.println("El nombre del student1 = " + student1.getName() + " " + student1.getLastName());
        System.out.println("El nombre del teacher1 = " + teacher1.getName() + " " + teacher1.getLastName());

        student1.setControlNumber(12345678);
        System.out.println("El numero de control de " + student1.getName() + " es " + student1.getControlNumber());

        teacher1.setBioCard(123);
        teacher1.setAbscription("Informatica");
        teacher1.setAssignedHours(5);

        System.out.println("El BioCard de la profesora " + teacher1.getName() + " es "+ teacher1.getBioCard());
        //Probando la sobrecarga de metodos
        System.out.println("Metodo toString() de student: " + student1.toString());

        System.out.println("Metodo toString() de teacher: " + teacher1.toString());

        System.out.println(teacher1.soy());
        System.out.println(student1.soy());
    }
}
