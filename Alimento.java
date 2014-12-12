
/**
 * Clase para los alimentos
 */
public class Alimento
{
    /**
     * Atributos (por cada 100 gramos de alimento)
     */
    private String nombre;
    
    private float proteinas;
    
    private float carbohidratos;
    
    private float grasas;
    
    private float calorias;
    
    /**
     * Nombre y proteínas, carbohidratos y grasas por cada 100 gramos.
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas )
    {
       this.nombre = nombre;
       this.proteinas = proteinas;
       this.carbohidratos = carbohidratos;
       this.grasas = grasas;
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
    
     public float getCalorias()
    {
        calorias = grasas*9 + carbohidratos*4+ proteinas*4;
        return calorias;
    }
}