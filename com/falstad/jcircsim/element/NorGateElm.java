package com.falstad.jcircsim.element;

import java.util.StringTokenizer;

public class NorGateElm extends OrGateElm
{
    public static final String NAME = "NOR Gate";

    public NorGateElm(int xx, int yy)
    {
        super(xx, yy);
    }

    public NorGateElm(int xa, int ya, int xb, int yb, int f, StringTokenizer st)
    {
        super(xa, ya, xb, yb, f, st);
    }

    public String getGateName()
    {
        return "NOR gate";
    }

    public boolean isInverting()
    {
        return true;
    }

    public int getDumpType()
    {
        return 153;
    }
}
