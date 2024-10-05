package gr.aueb.cf.ch14;

/**
 * Lazy Instantiation
 */
public class CodingFactoryLazy {

    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy () {

    }

    /**
     * The first time only, uses the Default Constructon for instantiation
     * @return
     */
    public static CodingFactoryLazy getInstance() {
      if (INSTANCE == null) {
          INSTANCE = new CodingFactoryLazy();
      }
      return INSTANCE;
    }

    public void sayHello(){
        System.out.println("hello CF");
    }
}
