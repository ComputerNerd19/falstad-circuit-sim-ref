package com.falstad.jcircsim.element;

public class PJfetElm extends JfetElm
{
    public static final String NAME = "JFET (p-channel)";

    public PJfetElm(int xx, int yy)
    {
        super(xx, yy, true);
    }

    public Class getDumpClass()
    {
        return JfetElm.class;
    }
}
