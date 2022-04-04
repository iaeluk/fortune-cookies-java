package com.docker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class FortuneCookieController {

    final private List<String> frases = Arrays.asList(
            "A perseverança é a mãe da boa sorte.",
            "Destino não é uma questão de sorte, mas uma questão de escolha; não é uma coisa que se espera, mas que se busca.",
            "Que sorte possuir uma grande inteligência: nunca te faltam asneiras para dizer.",
            "Sorte é estar pronto quando a oportunidade vem.",
            "A sorte favorece a mente bem preparada.",
            "A sorte ajuda os audazes."
    );

    @GetMapping("/")
    public String indexRoute() {
        int indice = ThreadLocalRandom.current().nextInt(frases.size());
        return frases.get(indice);
    }
}
