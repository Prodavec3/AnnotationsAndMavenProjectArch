package Annotations;

/**
 * Наша библоитека может использовать информацию данного метода, который использует аннотацию
 */
public class AnnotationTest {
    @MethodInfo(author = "Im", purpose = "Print Hello World")
    public void printHelloWorld(){
        System.out.println("Hello World");
    }
}
