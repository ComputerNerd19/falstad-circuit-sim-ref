package com.falstad.jcircsim;

import java.util.Vector;

public class CircuitNode
{
    public int x, y;
    public Vector links;
    public boolean internal;

    public CircuitNode()
    {
        links = new Vector();
    }
}
