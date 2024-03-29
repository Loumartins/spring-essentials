package com.luiz.louifood.di.listener;

import com.luiz.louifood.di.notificacao.NivelUrgencia;
import com.luiz.louifood.di.notificacao.Notificador;
import com.luiz.louifood.di.notificacao.TipoDoNotificador;
import com.luiz.louifood.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo");
    }
}
