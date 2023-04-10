package bridge;

public class FreteExpresso extends Frete {

    public FreteExpresso(float valorBase) {

        super(valorBase);
    }

    public float calcularValorFrete() {

        return this.valorBase * (1 + this.regiao.percentualAumento());
    }
}
