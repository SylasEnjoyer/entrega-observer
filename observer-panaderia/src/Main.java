public class Main {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        System.out.println("========================================");
        System.out.println("          Creamos panaderia y vecinos");
        System.out.println("========================================");
        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");
        System.out.println("========================================");
        System.out.println("          Suscribimos los vecinor");
        System.out.println("========================================");

        panaderia.suscribir(ana);
        panaderia.suscribir(luis);
        panaderia.suscribir(marta);
        System.out.println("========================================");
        System.out.println("          Sacamos el pan en la mañana");
        System.out.println("========================================");
        for (int hora = 5; hora <= 7; hora++) {
            System.out.println("-- " + hora + ":00 --");
            if (hora == 7) {
                panaderia.sacarPan();
            }

        }
    }
}
