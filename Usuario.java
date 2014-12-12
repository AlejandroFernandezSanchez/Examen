
/**
 *Esta clase representan a las personas que utilizan el programa
 */
public class Usuario
{    
   
    private String nombre;
         
    private float proteinas;
    
    private float carbohidratos;
    
    private float grasas;
    
    private float calorias;

    /**
     * Constructor de la clase
     */
    public Usuario(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * muestra por pantalla el estado actual del usuario
     */
    public void estado()
    {
        System.out.println("Nombre:                                         " + nombre );        
        System.out.println("gramos de proteinas ingeridos:                  " + proteinas );
        System.out.println("gramos de carbohidratos ingeridos:              " + carbohidratos );
        System.out.println("gramos de grasas ingeridos:                     " + grasas );
        System.out.println("caloraías ingeirdas:                            " + calorias ); 
    }
    
    /**
     * Hace comer al usuario un tipo de comida y una cierta cantidad del mismo ( en gramos).
     */
    public void comer(Alimento comida, int gr)
    {
        proteinas=proteinas+comida.getProteinas()*gr;
        grasas=grasas+comida.getGrasas()*gr;
        carbohidratos=carbohidratos+comida.getCarbohidratos()*gr;
        calorias=calorias+comida.getCalorias()*gr;
    }
}
