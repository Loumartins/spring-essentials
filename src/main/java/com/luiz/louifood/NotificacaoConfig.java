package com.luiz.louifood;

import com.luiz.louifood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.luimail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
