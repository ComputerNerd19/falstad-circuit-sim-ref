package com.falstad.jcircsim.view.edit;

import com.falstad.jcircsim.CirSim;
import com.falstad.jcircsim.element.CircuitElm;
import com.falstad.jcircsim.view.edit.EditInfo;
import com.falstad.jcircsim.view.edit.Editable;

public class EditOptions implements Editable
{
    public final CirSim sim;

    public EditOptions(CirSim s)
    {
        sim = s;
    }

    public EditInfo getEditInfo(int n)
    {
        if (n == 0)
            return new EditInfo("Time step size (s)", sim.timeStep, 0, 0);
        if (n == 1)
            return new EditInfo("Range for voltage color (V)", CircuitElm.voltageRange, 0, 0);

        return null;
    }

    public void setEditValue(int n, EditInfo ei)
    {
        if (n == 0 && ei.value > 0)
            sim.timeStep = ei.value;
        if (n == 1 && ei.value > 0)
            CircuitElm.voltageRange = ei.value;
    }
}
