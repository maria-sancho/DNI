public class Main {
    public static void main(String[] args) {
        DNI dni = new DNI("76515373P");
        System.out.println(dni.getNumber());
        System.out.println(dni.getLetter());
        System.out.println(dni.toString());
        System.out.println(dni.toFormattedString());
        System.out.println(dni.correctDNI());
        System.out.println(DNI.letterForDni(53793566));
        System.out.println(DNI.NifForDni(53793566));
    }
}