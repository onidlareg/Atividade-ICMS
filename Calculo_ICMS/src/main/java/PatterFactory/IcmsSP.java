package PatterFactory;

import java.math.BigDecimal;

import modelo.Orcamento;

public class IcmsSP implements CalculoPorRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.19"));
    }

}
