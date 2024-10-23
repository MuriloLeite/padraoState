import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaTest {

    Entrega entrega;

    @BeforeEach
    public void setUp() {
        entrega = new Entrega("12345");
    }

    @Test
    public void deveDespacharEntregaEmPreparacao() {
        entrega.setEstado(EntregaEstadoEmPreparacao.getInstance());
        assertTrue(entrega.despachar());
        assertEquals(EntregaEstadoDespachada.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveEntregarEntregaEmPreparacao() {
        entrega.setEstado(EntregaEstadoEmPreparacao.getInstance());
        assertFalse(entrega.entregar());
        assertEquals(EntregaEstadoEmPreparacao.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDevolverEntregaEmPreparacao() {
        entrega.setEstado(EntregaEstadoEmPreparacao.getInstance());
        assertFalse(entrega.devolver());
        assertEquals(EntregaEstadoEmPreparacao.getInstance(), entrega.getEstado());
    }

    @Test
    public void deveEntregarEntregaDespachada() {
        entrega.setEstado(EntregaEstadoDespachada.getInstance());
        assertTrue(entrega.entregar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDespacharEntregaDespachada() {
        entrega.setEstado(EntregaEstadoDespachada.getInstance());
        assertFalse(entrega.despachar());
        assertEquals(EntregaEstadoDespachada.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDevolverEntregaDespachada() {
        entrega.setEstado(EntregaEstadoDespachada.getInstance());
        assertFalse(entrega.devolver());
        assertEquals(EntregaEstadoDespachada.getInstance(), entrega.getEstado());
    }

    @Test
    public void deveDevolverEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertTrue(entrega.devolver());
        assertEquals(EntregaEstadoDevolvida.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveEntregarEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.entregar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDespacharEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.despachar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDespacharEntregaDevolvida() {
        entrega.setEstado(EntregaEstadoDevolvida.getInstance());
        assertFalse(entrega.despachar());
        assertEquals(EntregaEstadoDevolvida.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveEntregarEntregaDevolvida() {
        entrega.setEstado(EntregaEstadoDevolvida.getInstance());
        assertFalse(entrega.entregar());
        assertEquals(EntregaEstadoDevolvida.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDevolverEntregaDevolvida() {
        entrega.setEstado(EntregaEstadoDevolvida.getInstance());
        assertFalse(entrega.devolver());
        assertEquals(EntregaEstadoDevolvida.getInstance(), entrega.getEstado());
    }

    @Test
    public void testeTransicoesValidas() {
        entrega.setEstado(EntregaEstadoEmPreparacao.getInstance());
        assertTrue(entrega.despachar());
        assertEquals(EntregaEstadoDespachada.getInstance(), entrega.getEstado());

        assertTrue(entrega.entregar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());

        assertTrue(entrega.devolver());
        assertEquals(EntregaEstadoDevolvida.getInstance(), entrega.getEstado());
    }
}
