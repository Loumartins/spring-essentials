package com.luiz.louifood.di.notificacao;

import com.luiz.louifood.di.modelo.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensagem);
}
