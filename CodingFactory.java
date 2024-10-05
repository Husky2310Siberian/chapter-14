package gr.aueb.cf.ch14;

/**
 * Defines a Singleton CodingFactory
 * Eager instantiation
 */
public class CodingFactory {
    /**
     * Creates a pre constructor with one and only instance (INSTANCE)
     */
    private static final CodingFactory INSTANCE = new CodingFactory();

    /**
     * Default Constructor, can not be initialized
     */
    private CodingFactory(){

    }

    /**
     *
     * @return the preconstructed instance
     */
   public static CodingFactory getInstance(){
        return INSTANCE;
   }

   public void sayHello () {
       System.out.println("coding factory");
   }


}
