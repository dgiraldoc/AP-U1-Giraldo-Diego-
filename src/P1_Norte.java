public interface P1_Norte {
    String Entrar (String Tipo, String token, String puerta, int Lamport);
    String Salir (String Tipo, String token, String puerta, int Lamport);
    String Estado (int personas_dentro, int aforo);
}
