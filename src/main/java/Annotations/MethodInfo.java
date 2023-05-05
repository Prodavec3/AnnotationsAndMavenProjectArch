package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Пишем библиотеку, которая будет взаимодействовать с кодом пользователя и он сможет нашей
 * аннотацией помечать свой код.
 */
@Target(ElementType.METHOD) // ограничили использование - теперь ее можно использовать только на методах
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author();
    int dataOfCreation() default 2023;
    String purpose();
}
