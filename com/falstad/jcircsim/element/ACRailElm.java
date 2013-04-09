package com.falstad.jcircsim.element;

public class ACRailElm extends RailElm
{
    public static final String NAME = "Add A/C Source (1-terminal)";

    public ACRailElm(int xx, int yy)
    {
        super(xx, yy, WF_AC);
    }

    public Class getDumpClass()
    {
        return RailElm.class;
    }
}
