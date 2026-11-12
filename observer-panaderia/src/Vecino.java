public class Vecino implements Observer{
    private String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String notificacion){
        System.out.println("oye, "+nombre+ " ya hay pan");

    }
    public String getNombre(){
        return nombre;
    }
}
