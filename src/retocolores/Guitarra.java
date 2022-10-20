package retocolores;

public class Guitarra {
    private int cantidadcolores;
    private String nombre_objeto;
    private int numero_cuerdas;
    private String cancion;
   
    Guitarra(){
    }

    public int getCantidadcolores() {
        return cantidadcolores;
    }

    public String getNombre_objeto() {
        return nombre_objeto;
    }

    public int getNumero_cuerdas() {
        return numero_cuerdas;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCantidadcolores(int cantidadcolores) {
        this.cantidadcolores = cantidadcolores;
    }

    public void setNombre_objeto(String nombre_objeto) {
        this.nombre_objeto = nombre_objeto;
    }

    public void setNumero_cuerdas(int numero_cuerdas) {
        this.numero_cuerdas = numero_cuerdas;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
}
