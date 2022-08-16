import java.math.BigDecimal;


public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        return tipoImposto.calcular(orcamento);

        }

    }

