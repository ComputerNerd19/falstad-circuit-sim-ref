package com.falstad.jcircsim.element;

public class NMosfetElm extends MosfetElm
{
    public static final String NAME = "MOSFET (n-channel)";

    public NMosfetElm(int xx, int yy)
    {
        super(xx, yy, false);
    }

    public Class getDumpClass()
    {
        return MosfetElm.class;
    }
}
