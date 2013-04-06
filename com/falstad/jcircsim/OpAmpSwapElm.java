package com.falstad.jcircsim;

public class OpAmpSwapElm extends OpAmpElm
{
    public OpAmpSwapElm(int xx, int yy)
    {
        super(xx, yy);
        flags |= FLAG_SWAP;
    }

    Class getDumpClass()
    {
        return OpAmpElm.class;
    }
}
