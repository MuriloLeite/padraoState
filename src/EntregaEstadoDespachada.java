public class EntregaEstadoDespachada extends EntregaEstado {

    private EntregaEstadoDespachada() {}
    private static EntregaEstadoDespachada instance = new EntregaEstadoDespachada();
    public static EntregaEstadoDespachada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Despachada";
    }

    @Override
    public boolean entregar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        return true;
    }

    @Override
    public boolean despachar(Entrega entrega) {
        return false;
    }
}
