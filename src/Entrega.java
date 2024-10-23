public class Entrega {

    private String codigo;
    private EntregaEstado estado;

    public Entrega(String codigo) {
        this.codigo = codigo;
        this.estado = EntregaEstadoEmPreparacao.getInstance();
    }

    public void setEstado(EntregaEstado estado) {
        this.estado = estado;
    }

    public EntregaEstado getEstado() {
        return estado;
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean despachar() {
        return estado.despachar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }
}
