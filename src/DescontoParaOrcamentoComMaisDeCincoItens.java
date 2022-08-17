import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    protected DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    //Primeiro vai verificar se se aplica o método
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return false;
    }
}
