package com.wudima.reflection;


import com.wudima.exceptions.ExcersiceNotCompleted;

import java.lang.reflect.Field;

public class ReflectionAPI {

    /*
      createClass & createInstance have common test and will execute together
     */

    /**
     * create class for work with reflection
     **/
    public static Class<?> createClass(String className) throws ClassNotFoundException {

        throw new ExcersiceNotCompleted();


    }

    /**
     * create an instance of object
     **/
    public static Object createInstance(Class <?> clazz,String model, int year) throws Exception {

        throw new ExcersiceNotCompleted();
    }

    /**
     * invoke method "on" from class Car by using Reflection
     **/
    public static void invokeMethodOne(Class <?> clazz, Object object, String methodName) throws Exception {

        throw new ExcersiceNotCompleted();


    }

    /**
     * change private field "color" using Reflection
     **/
    public static void changePrivateField(Class <?> clazz, Object object,String fieldName, String col) throws Exception{

        throw new ExcersiceNotCompleted();
    }
}
