package com.icms;

import java.math.BigDecimal;

import PatterFactory.IcmsFactory;
import modelo.Orcamento;

public class Main 
{
    public static void main( String[] args ){

        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"),"ICMS_SP");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_SP").calculoPorRegiao(orcamento);

        System.out.println(resultado);
    }
}
