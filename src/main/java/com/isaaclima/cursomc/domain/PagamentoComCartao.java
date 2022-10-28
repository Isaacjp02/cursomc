package com.isaaclima.cursomc.domain;

import javax.persistence.Entity;

import com.isaaclima.cursomc.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
    private static final long serialVersionUID = 1L;
    
    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
