interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void enviarMensagem(String mensagem, String numero);
    void receberMensagem(String mensagem, String numero);
}