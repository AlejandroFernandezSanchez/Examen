
/**
 *Esta clase representan a las personas que utilizan el programa
 */
public class Usuario
{    
    //nombre del usuario
    private String nombre;
    //gramos de proteinas ingeridos
    private float proteinas;
    //gramos de carbohidratos ingeridos
    private float carbohidratos;
    //gramos de grasas ingeridos
    private float grasas;
    //gramos de calorias ingeridos
    private float calorias;
    //gramos de comida total ingerida
    private float gramos;

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
        String strProt="gramos de proteinas ingeridos:                  " + proteinas;
        if (proteinas>0)
        {
            strProt=strProt  +" (" + (proteinas*100/gramos) + "%)";
        }
        String strCar="gramos de carbohidratos ingeridos:              " + carbohidratos;
        if (carbohidratos>0)
        {
            strCar=strCar  +" (" + (carbohidratos*100/gramos) + "%)";
        }
        String strGra="gramos de grasas ingeridos:                     " + grasas;
        if (grasas>0)
        {
            strGra=strGra  +" (" + (grasas*100/gramos) + "%)";
        }
        System.out.println(strProt);
        System.out.println(strCar);
        System.out.println(strGra);
        System.out.println("caloraías ingeirdas:                            " + calorias ); 
    }
    
    /**
     * Hace comer al usuario un tipo de comida y una cierta cantidad del mismo ( en gramos).
     */
    public void comer(Alimento comida, float gr)
    {
        float grCien = gr/100;
        proteinas=proteinas+comida.getProteinas()*grCien;        
        grasas=grasas+comida.getGrasas()*(gr/100);       
        carbohidratos=carbohidratos+comida.getCarbohidratos()*grCien;             
        calorias=calorias+comida.getCalorias()*grCien;
        gramos=gr;
    }
}
