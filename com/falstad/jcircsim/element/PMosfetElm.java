package com.falstad.jcircsim.element;

public class PMosfetElm extends MosfetElm
{
    public static final String NAME = "MOSFET (p-channel)";

    public PMosfetElm(int xx, int yy)
    {
        super(xx, yy, true);
    }

    public Class getDumpClass()
    {
        return MosfetElm.class;
    }
}
