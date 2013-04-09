package com.falstad.jcircsim.element;

public class PTransistorElm extends TransistorElm
{
    public static final String NAME = "Transistor (bipolar, PNP)";

    public PTransistorElm(int xx, int yy)
    {
        super(xx, yy, true);
    }

    public Class getDumpClass()
    {
        return TransistorElm.class;
    }
}
