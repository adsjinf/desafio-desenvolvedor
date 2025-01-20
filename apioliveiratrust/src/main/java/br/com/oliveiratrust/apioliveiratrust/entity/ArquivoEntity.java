package br.com.oliveiratrust.apioliveiratrust.entity;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "tb_arquivos")
public class ArquivoEntity {

    @MongoId
    private Long arquivoId;

    @Indexed(name ="nome_arquivo_index")
    private String nomeArquivo;
    private String usuario;

    private List<ItemArquivoEntity> itens;

    public Long getArquivoId() {
        return arquivoId;
    }

    public void setArquivoId(Long arquivoId) {
        this.arquivoId = arquivoId;
    }

    public String getNome() {
        return nomeArquivo;
    }

    public void setNome(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<ItemArquivoEntity> getItens() {
        return itens;
    }

    public void setItens(List<ItemArquivoEntity> itens) {
        this.itens = itens;
    }
}
