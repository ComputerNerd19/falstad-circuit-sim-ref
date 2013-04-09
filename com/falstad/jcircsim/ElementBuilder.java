package com.falstad.jcircsim;

import com.falstad.jcircsim.element.CircuitElm;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ElementBuilder implements Serializable
{
    public static CircuitElm build(Class elmClass, int x0, int y0)
    {
        // find element class
        Class carr[] = new Class[2];
        // carr[0] = getClass();
        carr[0] = carr[1] = int.class;
        Constructor cstr = null;
        try
        {
            cstr = elmClass.getConstructor(carr);
        } catch (NoSuchMethodException ee)
        {
            System.out.println("caught NoSuchMethodException " + elmClass);
            return null;
        } catch (Exception ee)
        {
            ee.printStackTrace();
            return null;
        }

        // invoke constructor with starting coordinates
        Object oarr[] = new Object[2];
        oarr[0] = new Integer(x0);
        oarr[1] = new Integer(y0);
        try
        {
            return (CircuitElm) cstr.newInstance(oarr);
        } catch (Exception ee)
        {
            ee.printStackTrace();
        }
        return null;
    }
}
