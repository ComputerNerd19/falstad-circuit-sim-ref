package com.falstad.jcircsim;

import com.falstad.jcircsim.element.CircuitElm;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ElementBuilder implements Serializable
{
    public static CircuitElm build(Class elmClass, int x, int y)
    {
        /** Define element constructor argument classes */
        Class constructorArgumentClasses[] = new Class[2];
        constructorArgumentClasses[0] = constructorArgumentClasses[1] = int.class;

        /** Get consctructor */
        Constructor constructor = null;
        try
        {
            constructor = elmClass.getConstructor(constructorArgumentClasses);
        }
        catch (NoSuchMethodException ee)
        {
            System.out.println("caught NoSuchMethodException " + elmClass);
            return null;
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
            return null;
        }

        /**
         * Invoke constructor with starting coordinates.
         * Creates element.
         */
        Object arguments[] = new Object[2];
        arguments[0] = new Integer(x);
        arguments[1] = new Integer(y);
        try
        {
            return (CircuitElm) constructor.newInstance(arguments);
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }

        return null;
    }
}
