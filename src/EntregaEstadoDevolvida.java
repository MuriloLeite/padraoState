public class EntregaEstadoDevolvida extends EntregaEstado {

    private EntregaEstadoDevolvida() {}
    private static EntregaEstadoDevolvida instance = new EntregaEstadoDevolvida();
    public static EntregaEstadoDevolvida getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Devolvida";
    }

    @Override
    public boolean devolver(Entrega entrega) {
        return false;
    }

    @Override
    public boolean entregar(Entrega entrega) {
        return false;
    }

    @Override
    public boolean despachar(Entrega entrega) {
        return false;
    }
}
