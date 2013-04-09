package com.falstad.jcircsim.element;

public class PushSwitchElm extends SwitchElm
{
    public static final String NAME = "Push Switch";

    public PushSwitchElm(int xx, int yy)
    {
        super(xx, yy, true);
    }

    public Class getDumpClass()
    {
        return SwitchElm.class;
    }
}
