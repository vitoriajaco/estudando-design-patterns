import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular (Orcamento orcamento) {
       Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
               new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));

        return desconto.efetuarCalculo(orcamento);
    }
}
