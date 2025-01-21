package br.com.oliveiratrust.apioliveiratrust.listener.dto;

import java.util.List;

public record OliveiraTrustCreatedEvent(
        Long arquivoId,
        String nomeArquivo,
        String usuario,
        List<ItensArquivoEvent> itens
) {
}
