public interface Observable {
    public void suscribir(Vecino v);
    public void desuscribir(Vecino v);
    public void notificar(String msj);

}
