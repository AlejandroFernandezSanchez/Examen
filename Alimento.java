
/**
 * Clase para los alimentos
 */
public class Alimento
{
    //nombre del alimento
    private String nombre;
    
    /**
     * Atributos (por cada 100 gramos de alimento)
     */
    private float proteinas;
    
    private float carbohidratos;
    
    private float grasas;
        
    //calorias del alimento
    private float calorias;
    
    /**
     * Nombre y proteínas, carbohidratos y grasas por cada 100 gramos.
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas )
    {
       this.nombre = nombre;
       this.proteinas = proteinas/100;
       this.carbohidratos = carbohidratos/100;
       this.grasas = grasas/100;
       calorias = getCalorias();
    }
    
    /**
     * Imprime por pantalla los datos del alimento.
     */
    public void muestraDatos()
    {    
        System.out.println("Nombre:                                          " + nombre );        
        System.out.println("Proteinas por cada 100 gramos :                  " + proteinas );
        System.out.println("Carbohidratos por cada 100 gramos:               " + carbohidratos );
        System.out.println("grasas por cada 100 gramos:                      " + grasas );
        System.out.println("caloraías:                                       " + calorias );        
        String mayoritario ="componente/s mayoritario/s:                      ";
                
        if (proteinas==carbohidratos && proteinas==grasas)
        {
            mayoritario = mayoritario + "<Ninguno>";
        }
        else if(proteinas==carbohidratos && (proteinas+carbohidratos)>grasas)
        {
            mayoritario = mayoritario + "Proteinas y carbohidratos";
        }
        else if(proteinas==grasas && (proteinas+grasas)> carbohidratos)
        {
            mayoritario = mayoritario + "Proteinas y grasas";            
        }
        else if(carbohidratos==grasas && (grasas+carbohidratos)> proteinas)
        {
            mayoritario = mayoritario + "Carbohidratos y grasas";            
        }
        else if (proteinas>carbohidratos && proteinas>carbohidratos)
        {
            mayoritario = mayoritario + "Proteinas";
        }
        else if (carbohidratos>grasas)
        {
            mayoritario = mayoritario + "Carbohidratos";
        }
        else 
        {
            mayoritario = mayoritario + "Grasas";
        }
        System.out.println(mayoritario);
    }
    
    
    /**
     * Estos son los métodos getters de la clase que permiten que se puedan usar los valores de los atributos
     * por otros métodos
     */
    public String getNombre()
    {        
        return nombre;
    }
    
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
    //devuelve las calorias por 100 gramos del alimento
     public float getCalorias()
    {
        calorias = (grasas*9 + carbohidratos*4+ proteinas*4);
        return calorias;
    }
}