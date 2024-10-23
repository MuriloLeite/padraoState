public class EntregaEstadoEntregue extends EntregaEstado {

    private EntregaEstadoEntregue() {}
    private static EntregaEstadoEntregue instance = new EntregaEstadoEntregue();
    public static EntregaEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }

    @Override
    public boolean devolver(Entrega entrega) {
        entrega.setEstado(EntregaEstadoDevolvida.getInstance());
        return true;
    }

    @Override
    public boolean entregar(Entrega entrega) {
        return false;
    }
}
