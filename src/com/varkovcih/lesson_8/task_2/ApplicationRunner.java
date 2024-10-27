package com.varkovcih.lesson_8.task_2;

import com.varkovcih.lesson_8.task_2.model.Apple;

import java.lang.reflect.Field;

/**
 * Создать класс Apple и добавить в него поле color с модификатором доступа private и
 * инициализировать его. В методе main другого класса создать объект Apple, и не
 * используя сеттеры изменить значение поля color
 */
public class ApplicationRunner {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "red");
        field.setAccessible(false);

        System.out.println(apple.getColor());
    }
}
