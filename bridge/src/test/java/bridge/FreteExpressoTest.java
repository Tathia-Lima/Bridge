package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreteExpressoTest {

    private FreteExpresso freteExpresso;

    @Test
    public void testCalcularValorFreteNordeste() {
        freteExpresso = new FreteExpresso(150.0f);
        freteExpresso.setRegiao(new Nordeste());
        assertEquals(225.0f, freteExpresso.calcularValorFrete(), 0.001f);
    }

    @Test
    public void testCalcularValorFreteNorte() {
        freteExpresso = new FreteExpresso(150.0f);
        freteExpresso.setRegiao(new Norte());
        assertEquals(195.0f, freteExpresso.calcularValorFrete(), 0.001f);
    }

    @Test
    public void testCalcularValorFreteSudeste() {
        freteExpresso = new FreteExpresso(100.0f);
        freteExpresso.setRegiao(new Sudeste());
        assertEquals(110.0f, freteExpresso.calcularValorFrete(), 0.001f);
    }

    @Test
    public void testCalcularValorFreteSul() {
        freteExpresso = new FreteExpresso(100.0f);
        freteExpresso.setRegiao(new Sul());
        assertEquals(120.0f, freteExpresso.calcularValorFrete(), 0.001f);
    }
}