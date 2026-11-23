public class CoordinadorStub {

    private final P1_Norte impl;

    public CoordinadorStub(P1_Norte impl) {this.impl = impl;}

    public RespuestaP1 despachar(PeticionP1 p){
        try {
            Object[] a = p.args();
            Object resultado = switch (p.metodo()) {
                case "Entrar" -> impl.Entrar((String) a[0], (String) a[1], (String) a[2], (Integer) a[3]);
                case "Salir" -> impl.Salir((String) a[0], (String) a[1], (String) a[2], (Integer) a[3]);
                case "Estado" -> impl.Estado((Integer) a[0], (Integer) a[1]);
                default -> throw new IllegalArgumentException("procedimiento desconocido: " + p.metodo());
            };
            return RespuestaP1.ok(resultado);
        } catch (Exception e) {
            return RespuestaP1.fallo(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
