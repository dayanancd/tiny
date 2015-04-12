package ast;

public class NodoFuncionV extends NodoBase{
    private String nombre;
    private NodoBase parametros;
    private NodoBase declaraciones;
    private NodoBase cuerpo;
    private int lineaFinal;
    public NodoFuncion(String nombre,NodoBase parametros,NodoBase declaraciones,NodoBase cuerpo){
        this.cuerpo=cuerpo;
        this.nombre=nombre;
    }
    public String getNombre(){return this.nombre;}
    public NodoBase getCuerpo(){return this.cuerpo;}
    public NodoBase getParametros() { return parametros;  }
    public NodoBase getDeclaraciones() { return declaraciones; }
}
