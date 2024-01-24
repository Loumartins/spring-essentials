package com.luiz.louifood;

import com.luiz.louifood.di.notificacao.NotificadorEmail;
import com.luiz.louifood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class LouiConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.luimail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }
}
