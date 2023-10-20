package com.javarush.task.jdk13.task34.task3405;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/* 
Нарушение приватности
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    public static Map<String, Object> getFields(Object object) throws Exception {

        return Arrays.stream(object.getClass()
                .getDeclaredFields())
                .filter(f -> Modifier.isPrivate(f.getModifiers()))
                .peek(f -> f.setAccessible(true))
                .collect(Collectors.toMap(Field::getName, f -> fieldGetObject(f, object), (a, b) -> b));
    }

    @SneakyThrows
    private static Object fieldGetObject(Field field, Object obj){
        return field.get(obj);
    }


    public static Map<String, Object> getFields1(Object object) throws Exception {
        Map<String, Object> map = new HashMap<>();

        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            if(Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(object));
            }
        }

        return map;
    }

    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}
