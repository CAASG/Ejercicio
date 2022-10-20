package retocolores;

public class Flor {
    private int cantidadColores;
    private String nombrePlanta;
    private int numeroFlores;
    private int cantidadEspinas;
    
    Flor(){
    }

    public int getCantidadColores() {
        return cantidadColores;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public int getNumeroFlores() {
        return numeroFlores;
    }

    public int getCantidadEspinas() {
        return cantidadEspinas;
    }

    public void setCantidadColores(int cantidadColores) {
        this.cantidadColores = cantidadColores;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public void setNumeroFlores(int numeroFlores) {
        this.numeroFlores = numeroFlores;
    }

    public void setCantidadEspinas(int cantidadEspinas) {
        this.cantidadEspinas = cantidadEspinas;
    }
    
}
