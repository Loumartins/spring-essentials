package com.luiz.louifood.di.notificacao;

import com.luiz.louifood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorDeEmailMock implements Notificador{
    private boolean caixaAlta;

    public NotificadorDeEmailMock() {
        System.out.println("Notificador email dev");
    }
    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("MOCK: Notificaçao seria enviada para %s atraves do email %s : %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}


