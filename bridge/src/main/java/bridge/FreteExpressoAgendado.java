package bridge;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FreteExpressoAgendado extends Frete {

    private LocalDate dataEntrega;

    public FreteExpressoAgendado(float valorBase, LocalDate dataEntrega) {
        super(valorBase);
        this.dataEntrega = dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public float calcularValorFrete() {
        LocalDate dataAtual = LocalDate.now();
        long diferencaDias = ChronoUnit.DAYS.between(dataAtual, dataEntrega);

        if (diferencaDias >= 30) {
            return this.valorBase * (1 + this.regiao.percentualAumento());
        } else {

            float percentualAumento = this.regiao.percentualAumento() + (30 - diferencaDias) * 0.1f;
            float valorFrete = this.valorBase * (1 + percentualAumento);


            return valorFrete;
        }
    }
}
