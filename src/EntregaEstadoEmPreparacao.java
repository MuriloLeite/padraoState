public class EntregaEstadoEmPreparacao extends EntregaEstado {

    private EntregaEstadoEmPreparacao() {}
    private static EntregaEstadoEmPreparacao instance = new EntregaEstadoEmPreparacao();
    public static EntregaEstadoEmPreparacao getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Preparação";
    }

    @Override
    public boolean despachar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoDespachada.getInstance());
        return true;
    }

    @Override
    public boolean entregar(Entrega entrega) {
        return false;
    }
}
