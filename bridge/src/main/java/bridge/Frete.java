package bridge;

public abstract class Frete {

    protected Regiao regiao;

    protected float valorBase;

    public Frete(float valorBase) {

        this.valorBase = valorBase;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public void setValorBasealorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValorFrete();
}


