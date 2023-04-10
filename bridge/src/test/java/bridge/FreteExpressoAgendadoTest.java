package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class FreteExpressoAgendadoTest {

    @Test
    public void testCalcularValorFreteComMaisDe30DiasNordeste() {
        LocalDate dataEntrega = LocalDate.now().plusDays(35); // Data de entrega com mais de 30 dias
        Regiao regiao = new Nordeste();; // Definindo a região como Nordeste
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega); // Definindo o valor base do frete como 100
        agendamento.setRegiao(regiao);
        assertEquals(150.0f, agendamento.calcularValorFrete(), 0.01f);// Valor esperado é 100 + 30% de aumento da região (100 * 0.3)
    }

    @Test
    public void testCalcularValorFreteComMenosDe30DiasNordeste() {
        LocalDate dataEntrega = LocalDate.now().plusDays(20); // Data de entrega com mais de 30 dias
        Regiao regiao = new Nordeste();; // Definindo a região como Nordeste
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega); // Definindo o valor base do frete como 100
        agendamento.setRegiao(regiao);
        assertEquals(250.0f, agendamento.calcularValorFrete(), 0.01f);// Valor esperado é 100 + 30% de aumento da região (100 * 0.3) + com aumento gradual de 10% para cada dia a menos que 30
    }

    @Test
    public void testCalcularValorFreteNordeste() {
        Regiao regiao = new Nordeste();
        LocalDate dataEntrega = LocalDate.now().plusDays(5);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(400.0f, agendamento.calcularValorFrete(), 0.01f);
    }

    @Test
    public void testCalcularValorFreteNorte() {
        Regiao regiao = new Norte();
        LocalDate dataEntrega = LocalDate.now().plusDays(5);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(380.0f, agendamento.calcularValorFrete(), 0.1f);
    }

    @Test
    public void testCalcularValorFreteSudeste() {
        Regiao regiao = new Sudeste();
        LocalDate dataEntrega = LocalDate.now().plusDays(10);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(310.0f, agendamento.calcularValorFrete(), 0.01f);
    }

    @Test
    public void testCalcularValorFreteSudeste2() {
        Regiao regiao = new Sudeste();
        LocalDate dataEntrega = LocalDate.now().plusDays(1);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(400.0f, agendamento.calcularValorFrete(),0.1f);
    }

    @Test
    public void testCalcularValorFreteSudeste3() {
        Regiao regiao = new Sudeste();
        LocalDate dataEntrega = LocalDate.now().plusDays(31);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(110.0f, agendamento.calcularValorFrete(),0.1f);
    }

    @Test
    public void testCalcularValorFreteSul() {
        Regiao regiao = new Sul();
        LocalDate dataEntrega = LocalDate.now().plusDays(31);
        FreteExpressoAgendado agendamento = new FreteExpressoAgendado(100.0f, dataEntrega);
        agendamento.setRegiao(regiao);
        assertEquals(120.0f, agendamento.calcularValorFrete(), 0.1f);
    }
}