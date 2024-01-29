package com.luiz.louifood.di.listener;

import com.luiz.louifood.di.service.ClienteAtivadoEvent;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota fiscal para cliente" + event.getCliente().getNome());
    }
}
