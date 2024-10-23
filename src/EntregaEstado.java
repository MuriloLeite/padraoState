public abstract class EntregaEstado {

    public abstract String getEstado();

    public boolean preparar(Entrega entrega) {
        return false;
    }

    public boolean despachar(Entrega entrega) {
        return false;
    }

    public boolean entregar(Entrega entrega) {
        return false;
    }

    public boolean devolver(Entrega entrega) {
        return false;
    }
}
