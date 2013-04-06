package com.falstad.jcircsim;

import java.util.Vector;

public class CircuitNode
{
    int x, y;
    Vector links;
    boolean internal;

    CircuitNode()
    {
        links = new Vector();
    }
}
