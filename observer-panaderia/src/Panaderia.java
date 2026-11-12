import java.util.ArrayList;

public class Panaderia implements Observable{
    private boolean hayPan = false;
    private ArrayList<Vecino> vecinosSus = new ArrayList<Vecino>();
    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
        notificar("ya hay pan fresco");
    }
    public void suscribir(Vecino v){
        System.out.println("se le notificara a "+v.getNombre());
        vecinosSus.add(v);
    }
    public void desuscribir(Vecino v){
        System.out.println("ya no se le otificara a: "+ v.getNombre());
        vecinosSus.removeIf(vec -> vec.getNombre().equals(v.getNombre()));
    }
    public void notificar(String msj){
        for(Vecino v : vecinosSus){
            v.actualizar(msj);
        }
    }
}
