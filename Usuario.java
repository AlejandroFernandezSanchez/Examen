//esta linea permite usar la clase ArrayList
import java.util.ArrayList;
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
    //alimento mas calorico hasta el momento consumido
    private String MasCalo;
    //calorias del alimento mas calorico consumido hasta el momento
    private float floCalor;
    //lista de alimentos consumidos
    private ArrayList<Alimento> comidos;
    /**
     * Constructor de la clase
     */
    public Usuario(String nombre)
    {
        this.nombre=nombre;
        comidos = new ArrayList<Alimento>();
        proteinas=0;
        carbohidratos=0;
        grasas=0;
        calorias=0;
        gramos=0;
        MasCalo=null;
        floCalor=0;
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
        System.out.println("caloraías ingeridas:                            " + calorias ); 
    }
    
    /**
     * Hace comer al usuario un tipo de comida y una cierta cantidad del mismo ( en gramos).
     */
    public void comer(Alimento comida, float gr)
    {        
        proteinas=proteinas+comida.getProteinas()*gr;        
        grasas=grasas+comida.getGrasas()*gr;       
        carbohidratos=carbohidratos+comida.getCarbohidratos()*gr;             
        calorias=calorias+comida.getCalorias()*gr;
        gramos=gr;
        if (comida.getCalorias()>floCalor)
        {
            floCalor = comida.getCalorias();
            MasCalo = comida.getNombre();
        }
        comidos.add(comida);
    }
    
    /**
     * Compara calorias con otro usuario
     */
    public void comparar(Usuario rival)
    {
        if (calorias==rival.getCalorias())
        {
            System.out.println(nombre+ " ha consumido más calorias que " + rival.getNombre());            
        }
        else if (calorias<rival.getCalorias())
        {
            System.out.println(rival.getNombre()+ " ha consumido más calorias que " + nombre);
        }
        else
        {
             System.out.println("Los dos han consumido las mismas calorías");
        }
    }
    
    public void masCalorico()
    {
        if(floCalor>0)
        {
            System.out.println("Alimento más calórico ingerido por el usuario hasta el momento: " + MasCalo);
        }
        else
        {
            System.out.println("Aun no se ha consumido ningún alimento");
        }
    }
    
    /**
     * Muestra la información de la comida que se comió, dando el número del orden en el que se comió. 
     * (contando que el primero es 0)
     */
    public void muestraComida(int index)
    {
        if (validIndex(index))
        {
            Alimento comida = comidos.get(index);
            comida.muestraDatos();
        }
    }
    
    /**
     * comprueba que el valor que se le da es un índice válido
     */
    public boolean validIndex(int num)
    {
        boolean valid = false;
        if (!(num<0 || comidos.size()-1<num))
        {
            valid=true;          
        }   
        return valid;
    }
    
    
    
    /**
     * Los siguientes métodos son "getters" que sirven para devolver el valor de los atributos que utilizan otros
     * métodos
     */
    
    
    public float getProteinas()
    {
        return proteinas;
    }
    
     public float getGrasas()
    {
        return grasas;
    }
    
     public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
     public float getCalorias()
    {        
        return calorias;
    }
    
    public String getNombre()
    {        
        return nombre;
    }
}
