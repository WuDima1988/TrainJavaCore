package com.wudima.reflection;

import com.wudima.reflection.object.Car;
import org.junit.jupiter.api.*;

import java.lang.reflect.Field;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReflectionAPITest {

    private Class<?> clazz;
    private Object object;

    private final String classname = "com.wudima.reflection.object.Car";


    @BeforeEach
    public void setUp() throws Exception {

         clazz = ReflectionAPI.createClass(classname);
         object = ReflectionAPI.createInstance(clazz,"BMW" ,1999);

    }


    @Test
    @Order(1)
    void testCreateClass() {

        assertNotNull(clazz,"class Car couldn`t be null");
        assertEquals(classname, clazz.getName());

    }

    @Test
    @Order(2)
    void testCreateInstance() {

        assertNotNull(object,"Object couldn`t be null");
        assertInstanceOf(Car.class,object,"Object have to be an instance of Car");

    }

    @Test
    @Order(3)
    void testInvokeMethodOne() throws Exception {

        ReflectionAPI.invokeMethodOne(clazz,object,"on");

        Field fieldMotorWork = clazz.getDeclaredField("motorWork");
        fieldMotorWork.setAccessible(true);
        boolean on = fieldMotorWork.getBoolean(object);

        assertTrue(on,"InvokeMethodOne not have been invoked ");

    }


    @Test
    @Order(4)
    void testChangePrivateField() throws Exception {

        ReflectionAPI.changePrivateField(clazz, object, "color","red");

        Field field = clazz.getDeclaredField("color");
        field.setAccessible(true);
        String color = (String)field.get(object);

        assertEquals("red",color);
    }
}