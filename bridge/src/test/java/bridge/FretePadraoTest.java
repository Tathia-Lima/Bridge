package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FretePadraoTest {

    private FretePadrao fretePadrao;

    @Test
    public void testCalcularValorFreteNordeste() {
        Regiao regiao = new Nordeste();
        fretePadrao = new FretePadrao(100.0f);
        fretePadrao.setRegiao(regiao);
        assertEquals(100.0f, fretePadrao.calcularValorFrete());
    }

    @Test
    public void testCalcularValorFreteNorte() {
        Regiao regiao = new Norte();
        fretePadrao = new FretePadrao(100.0f);
        fretePadrao.setRegiao(regiao);
        assertEquals(100.0f, fretePadrao.calcularValorFrete());
    }

    @Test
    public void testCalcularValorFreteSudeste() {
        Regiao regiao = new Sudeste();
        fretePadrao = new FretePadrao(100.0f);
        fretePadrao.setRegiao(regiao);
        assertEquals(100.0f, fretePadrao.calcularValorFrete());
    }

    @Test
    public void testCalcularValorFreteSul() {
        Regiao regiao = new Sul();
        fretePadrao = new FretePadrao(100.0f);
        fretePadrao.setRegiao(regiao);
        assertEquals(100.0f, fretePadrao.calcularValorFrete());
    }
}