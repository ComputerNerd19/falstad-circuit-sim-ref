package com.falstad.jcircsim.element;

public class SquareRailElm extends RailElm
{
    public static final String NAME = "Square Wave (1-terminal)";

    public SquareRailElm(int xx, int yy)
    {
        super(xx, yy, WF_SQUARE);
    }

    public Class getDumpClass()
    {
        return RailElm.class;
    }
}
