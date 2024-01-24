package com.luiz.louifood;

import com.luiz.louifood.di.modelo.Cliente;
import com.luiz.louifood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MeuPrimeiroControler {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroControler(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController " + ativacaoClienteService);
    }


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("Joao","joao@xyz.com", "21321335454");
        ativacaoClienteService.ativar(joao);
        return "Ola";
    }
}
