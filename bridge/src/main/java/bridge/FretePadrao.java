package bridge;

public class FretePadrao extends Frete {

    public FretePadrao(float valorBase) {

        super(valorBase);
    }

    public float calcularValorFrete() {

        return this.valorBase;
    }
}
