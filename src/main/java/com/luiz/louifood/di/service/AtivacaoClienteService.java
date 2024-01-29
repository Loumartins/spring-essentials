package com.luiz.louifood.di.service;

import com.luiz.louifood.di.modelo.Cliente;
import com.luiz.louifood.di.notificacao.NivelUrgencia;
import com.luiz.louifood.di.notificacao.Notificador;
import com.luiz.louifood.di.notificacao.NotificadorEmail;
import com.luiz.louifood.di.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {
    //injecao de dependecia no atributo
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador  notificador;

//    ponto de injeçao de dependencia no constructor
//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Init" + notificador);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");

    }
//    ponto de injecao de dependencia no setter
//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
