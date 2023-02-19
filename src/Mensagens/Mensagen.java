package Mensagens;

import Usuario.Usuario;

public abstract class Mensagen {
    
    private String data;
    private Usuario sender;
    private Usuario receiver;

    public Mensagen(Usuario sender, Usuario receiver, String data) {

        this.sender = sender;
        this.receiver = receiver;
        this.data = data;
    }

 
    public Usuario getSender() {
        return sender;
    }

    public void setSender(Usuario sender) {
        this.sender = sender;
    }

    public Usuario getReceiver() {
        return receiver;
    }

    public void setReceiver(Usuario receiver) {
        this.receiver = receiver;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
