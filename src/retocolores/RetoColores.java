package retocolores;

public class RetoColores {

    public static void main(String[] args) {
        Flor n1 = new Flor();
        n1.setCantidadColores(2);
        n1.setNombrePlanta("Amapolas");
        n1.setNumeroFlores(2);
        n1.setCantidadEspinas(6);
        System.out.println("Las flores se llaman " + n1.getNombrePlanta() + " fue coloreada con " + n1.getCantidadColores() + " colores, estan compuestas"
                + " por " + n1.getNumeroFlores() + " flores y tienen " + n1.getCantidadEspinas() + " espinas. ");
    
    Guitarra n2 = new Guitarra();
        n2.setNombre_objeto("Guitarra clasica");
        n2.setCantidadcolores(5);
        n2.setNumero_cuerdas(6);
        n2.setCancion("love") ;
        System.out.println("La cancion que esta tocando la guitarra es " + n2.getCancion());
    
    }
    
}
