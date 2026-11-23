public class P1Impl implements P1_Norte{

    @Override
    public String Entrar(String Entrar, String token, String puerta, int Lamport) {
        return "Tipo: " + Entrar + " Token: " + token + "Puerta: " + puerta + "Lamport: " + Lamport;
    }

    @Override
    public String Salir(String Salir, String token, String puerta, int Lamport) {
        return "Tipo: " + Salir + "Token: " + token + "Puerta: " + puerta + "Lamport: " + Lamport;
    }

    @Override
    public String Estado(int personas_dentro, int aforo) {
        return "Peronas dentro: " + personas_dentro + "Aforo: " + aforo;
    }
}
