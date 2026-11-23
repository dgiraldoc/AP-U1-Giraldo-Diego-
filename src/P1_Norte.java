public interface P1_Norte {
    String Entrar (String Entrar, int token, String puerta, int Lamport);
    String Salir (String Salir, int token, String puerta, int Lamport);
    String Estado (int personas_dentro, int aforo);
}
