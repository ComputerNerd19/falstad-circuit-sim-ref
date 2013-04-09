package com.falstad.jcircsim.model;

import com.falstad.jcircsim.ElementBuilder;
import com.falstad.jcircsim.element.*;

import java.awt.*;

public class ElementRegistry
{
    public Class dumpTypes[];

    public void register(Class elmClass)
    {
        CircuitElm elm = ElementBuilder.build(elmClass, 0, 0);

        int dumpType = elm.getDumpType();
        if (dumpType == 0)
        {
            System.out.println("no dump type: " + elmClass);
            return;
        }
        Class dumpClass = elm.getDumpClass();
        if (dumpTypes[dumpType] == dumpClass)
            return;
        if (dumpTypes[dumpType] != null)
        {
            System.out.println("dump type conflict: " + elmClass + " " + dumpTypes[dumpType]);
            return;
        }
        dumpTypes[dumpType] = dumpClass;
    }
}
