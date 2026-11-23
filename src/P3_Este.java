public interface P3_Este {
    String Entrar (String entrar, int token, String puerta, int Lamport);
    String Salir (String Salir, int token, String puerta, int Lamport);
    String Estado (int personas_dentro, int aforo);
}
