package com.luiz.louifood;

import com.luiz.louifood.di.notificacao.Notificador;
import com.luiz.louifood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){

        return new AtivacaoClienteService(notificador);
    }
}
