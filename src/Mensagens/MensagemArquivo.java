package Mensagens;

import Usuario.Usuario;

public class MensagemArquivo extends Mensagen {
    
    private String nomeArquivo;
    private String tipoArquivo;
    private String tamanhoArquivo;
    private String linkArquivo;

    public MensagemArquivo(Usuario sender, Usuario receiver, String data, String nomeArquivo, String tipoArquivo,
            String tamanhoArquivo, String linkArquivo) {
        super(sender, receiver, data);
        this.nomeArquivo = nomeArquivo;
        this.tipoArquivo = tipoArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
        this.linkArquivo = linkArquivo;
    }

    public String getLinkArquivo() {
        return linkArquivo;
    }

    public void setLinkArquivo(String linkArquivo) {
        this.linkArquivo = linkArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(String tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return "MensagemArquivo [nomeArquivo=" + nomeArquivo + ", tipoArquivo=" + tipoArquivo + ", tamanhoArquivo="
                + tamanhoArquivo + ", getData()=" + getData() + ", getSender()=" + getSender() + ", getReceiver()="
                + getReceiver() + "]";
    }
}
