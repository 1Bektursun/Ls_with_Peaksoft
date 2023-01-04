package Ls27_Lamda;
@FunctionalInterface
public interface Person  {
    void work(String arg,int vilka);
    default void method(){
        System.out.println("Hello");
    }

}
