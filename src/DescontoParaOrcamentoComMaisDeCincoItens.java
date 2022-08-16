import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    protected DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    //Primeiro vai verificar se se aplica o método
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
