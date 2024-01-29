package com.luiz.louifood.di.notificacao;

import com.luiz.louifood.di.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorSMS implements Notificador{
    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s atraves do sms atraves do telefone %s : %s%n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
