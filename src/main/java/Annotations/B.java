package Annotations;

public class B extends A {
    @Override // Если метод в классе A теперь имеет другое название, то данная аннотация выдаст ошибку
    // Напишет что ничего не переопределяем
    public void test(){ // Переопределяем метод test() класса А
        System.out.println("Hello from class B");
    }
}
