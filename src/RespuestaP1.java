import java.io.Serializable;

public record RespuestaP1(Object valor, String error) implements Serializable{
    public static RespuestaP1 ok(Object valor) { return new RespuestaP1(valor, null); }
    public static RespuestaP1 fallo(String error) { return new RespuestaP1(null, error); }
    public boolean esError() { return error != null; }
}
