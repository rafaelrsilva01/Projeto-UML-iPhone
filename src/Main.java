public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.ligar();
        meuiPhone.play();
        meuiPhone.fazerChamada("123456789");
        meuiPhone.abrirURL("https://www.youtube.com/watch?v=9ou608QQRq8");
        meuiPhone.desligar();
    }
}