package spring.beans1.beans;


/*
 * Tiene un constructor privado, lo que significa que solo puede usarse desde 
 * dentro de la misma aplicación. Además tiene una instancia del mismo tipo, 
 * la cual se inicializa dentro de un método de inicialización estático, 
 * o sea que la instancia se creará en cuanto la clase se cargue en el classloader.
 * 
 * Como el constructor y la instancia de la clase son privadas, 
 * necesitamos una forma de obtener dicha instancia. 
 * Para eso proporcionamos un método de fábrica, el método "getInstancia", 
 * el cual nos regresará la instancia cada vez que la necesitemos.
 */
public class FactoryMethodUse {
	private static FactoryMethodUse instancia;

    static
    {
        instancia = new FactoryMethodUse();
    }

    private FactoryMethodUse()
    {
    	
    }

    public static FactoryMethodUse getInstancia()
    {
        return instancia;
    }

    public String getMensaje()
    {
        return "Hola a todos!!!!";
    }
}