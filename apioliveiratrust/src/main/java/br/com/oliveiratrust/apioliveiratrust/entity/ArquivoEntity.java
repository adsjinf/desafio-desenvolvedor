package br.com.oliveiratrust.apioliveiratrust.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "tb_arquivos")
public class ArquivoEntity {

    @MongoId
    private Long id;
    private String nome;

    private List<ArquivoItemEntity> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
