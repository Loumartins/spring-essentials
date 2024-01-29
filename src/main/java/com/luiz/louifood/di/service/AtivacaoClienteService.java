package com.luiz.louifood.di.service;

import com.luiz.louifood.di.modelo.Cliente;
import com.luiz.louifood.di.notificacao.Notificador;
import com.luiz.louifood.di.notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AtivacaoClienteService {
    //injecao de dependecia no atributo
    @Autowired(required = false)
    private Notificador notificador;

//    ponto de injeçao de dependencia no constructor
//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }


    public void ativar(Cliente cliente) {
        cliente.ativar();
        if(notificador != null){
            notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");
        } else {
            System.out.println("Nao existe notificador, mas cliente foi ativado");
        }
    }
//    ponto de injecao de dependencia no setter
//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
