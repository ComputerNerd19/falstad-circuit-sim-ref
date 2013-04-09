package com.falstad.jcircsim.element;

public class OpAmpSwapElm extends OpAmpElm
{
    public static final String NAME = "Op Amp (+ on top)";

    public OpAmpSwapElm(int xx, int yy)
    {
        super(xx, yy);
        flags |= FLAG_SWAP;
    }

    public Class getDumpClass()
    {
        return OpAmpElm.class;
    }
}
