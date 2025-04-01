package com.wudima.reflection;


import com.wudima.exceptions.ExcersiceNotCompleted;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAPI {

    /**
     * createClass & createInstance have common test and will execute together
     **/

    /**
     * create class for work with reflection
     **/
    public static Class<?> createClass(String className) throws ClassNotFoundException {

        return Class.forName(className);

    }

    /**
     * create an instance of object
     **/
    public static Object createInstance(Class <?> clazz,String model, int year) throws Exception {
        return clazz.getConstructor(String.class,Integer.class).newInstance(model,year);

    }

    /**
     * invoke method "on" from class Car by using Reflection
     **/
    public static void invokeMethodOne(Class <?> clazz, Object object) throws Exception {

        Method method = clazz.getMethod("on");
        method.invoke(object);


    }

    /**
     * change private field "color" using Reflection
     **/
    public static void changePrivateField(Class <?> clazz, Object object,String fieldName, String col) throws Exception{

        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object,col);
        
    }
}
