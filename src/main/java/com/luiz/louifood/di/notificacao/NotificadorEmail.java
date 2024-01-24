package com.luiz.louifood.di.notificacao;

import com.luiz.louifood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail(){
        System.out.println("NotificadorEmail");
    }

@Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s atraves do email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
