package Annotations;

public class A {
    public void test(){ // этот метод переопределяет В, но, допустим, меняем название метода тут на testA ->
        // можем проглядеть в классе В
        System.out.println("Hello from class A");
    }
}
