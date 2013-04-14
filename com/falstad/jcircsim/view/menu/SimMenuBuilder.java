package com.falstad.jcircsim.view.menu;

import com.falstad.jcircsim.CirSim;
import com.falstad.jcircsim.ElementBuilder;
import com.falstad.jcircsim.element.*;

import java.awt.*;

public class SimMenuBuilder
{
    private CirSim sim;
    private Boolean isMac;
    private String ctrlMetaKey;

    public SimMenuBuilder(CirSim sim)
    {
        this.sim = sim;

        String os = System.getProperty("os.name");
        isMac = (os.indexOf("Mac ") == 0);
        ctrlMetaKey = (isMac) ? "\u2318" : "Ctrl";
    }

    public PopupMenu buildAddElementsPopupMenu()
    {
        PopupMenu popupMenu = new PopupMenu();

        popupMenu.add(getClassCheckItem(WireElm.class));
        popupMenu.add(getClassCheckItem(ResistorElm.class));

        Menu passMenu = new Menu("Passive Components");
        popupMenu.add(passMenu);
        passMenu.add(getClassCheckItem(CapacitorElm.class));
        passMenu.add(getClassCheckItem(InductorElm.class));
        passMenu.add(getClassCheckItem(SwitchElm.class));
        passMenu.add(getClassCheckItem(PushSwitchElm.class));
        passMenu.add(getClassCheckItem(Switch2Elm.class));
        passMenu.add(getClassCheckItem(PotElm.class));
        passMenu.add(getClassCheckItem(TransformerElm.class));
        passMenu.add(getClassCheckItem(TappedTransformerElm.class));
        passMenu.add(getClassCheckItem(TransLineElm.class));
        passMenu.add(getClassCheckItem(RelayElm.class));
        passMenu.add(getClassCheckItem(MemristorElm.class));
        passMenu.add(getClassCheckItem(SparkGapElm.class));

        Menu inputMenu = new Menu("Inputs/Outputs");
        popupMenu.add(inputMenu);
        inputMenu.add(getClassCheckItem(GroundElm.class));
        inputMenu.add(getClassCheckItem(DCVoltageElm.class));
        inputMenu.add(getClassCheckItem(ACVoltageElm.class));
        inputMenu.add(getClassCheckItem(RailElm.class));
        inputMenu.add(getClassCheckItem(ACRailElm.class));
        inputMenu.add(getClassCheckItem(SquareRailElm.class));
        inputMenu.add(getClassCheckItem(OutputElm.class));
        inputMenu.add(getClassCheckItem(LogicInputElm.class));
        inputMenu.add(getClassCheckItem(LogicOutputElm.class));
        inputMenu.add(getClassCheckItem(ClockElm.class));
        inputMenu.add(getClassCheckItem(SweepElm.class));
        inputMenu.add(getClassCheckItem(VarRailElm.class));
        inputMenu.add(getClassCheckItem(AntennaElm.class));
        inputMenu.add(getClassCheckItem(CurrentElm.class));
        inputMenu.add(getClassCheckItem(LEDElm.class));
        inputMenu.add(getClassCheckItem(LampElm.class));

        Menu activeMenu = new Menu("Active Components");
        popupMenu.add(activeMenu);
        activeMenu.add(getClassCheckItem(DiodeElm.class));
        activeMenu.add(getClassCheckItem(ZenerElm.class));
        activeMenu.add(getClassCheckItem(NTransistorElm.class));
        activeMenu.add(getClassCheckItem(PTransistorElm.class));
        activeMenu.add(getClassCheckItem(OpAmpElm.class));
        activeMenu.add(getClassCheckItem(OpAmpSwapElm.class));
        activeMenu.add(getClassCheckItem(NMosfetElm.class));
        activeMenu.add(getClassCheckItem(PMosfetElm.class));
        activeMenu.add(getClassCheckItem(NJfetElm.class));
        activeMenu.add(getClassCheckItem(PJfetElm.class));
        activeMenu.add(getClassCheckItem(AnalogSwitchElm.class));
        activeMenu.add(getClassCheckItem(AnalogSwitch2Elm.class));
        activeMenu.add(getClassCheckItem(SCRElm.class));
        // activeMenu.add(getClassCheckItem("Add Varactor/Varicap",
        // "VaractorElm.class));
        activeMenu.add(getClassCheckItem(TunnelDiodeElm.class));
        activeMenu.add(getClassCheckItem(TriodeElm.class));
        // activeMenu.add(getClassCheckItem("DiacElm.class));
        // activeMenu.add(getClassCheckItem("TriacElm.class));
        // activeMenu.add(getClassCheckItem("Add Photoresistor",
        // "PhotoResistorElm.class));
        // activeMenu.add(getClassCheckItem("ThermistorElm.class));
        activeMenu.add(getClassCheckItem(CC2Elm.class));
        activeMenu.add(getClassCheckItem(CC2NegElm.class));

        Menu gateMenu = new Menu("Logic Gates");
        popupMenu.add(gateMenu);
        gateMenu.add(getClassCheckItem(InverterElm.class));
        gateMenu.add(getClassCheckItem(NandGateElm.class));
        gateMenu.add(getClassCheckItem(NorGateElm.class));
        gateMenu.add(getClassCheckItem(AndGateElm.class));
        gateMenu.add(getClassCheckItem(OrGateElm.class));
        gateMenu.add(getClassCheckItem(XorGateElm.class));

        Menu chipMenu = new Menu("Chips");
        popupMenu.add(chipMenu);
        chipMenu.add(getClassCheckItem(DFlipFlopElm.class));
        chipMenu.add(getClassCheckItem(JKFlipFlopElm.class));
        chipMenu.add(getClassCheckItem(SevenSegElm.class));
        chipMenu.add(getClassCheckItem(VCOElm.class));
        chipMenu.add(getClassCheckItem(PhaseCompElm.class));
        chipMenu.add(getClassCheckItem(CounterElm.class));
        chipMenu.add(getClassCheckItem(DecadeElm.class));
        chipMenu.add(getClassCheckItem(TimerElm.class));
        chipMenu.add(getClassCheckItem(DACElm.class));
        chipMenu.add(getClassCheckItem(ADCElm.class));
        chipMenu.add(getClassCheckItem(LatchElm.class));

        Menu otherMenu = new Menu("Other");
        popupMenu.add(otherMenu);
        otherMenu.add(getClassCheckItem(TextElm.class));
        otherMenu.add(getClassCheckItem(ProbeElm.class));
        otherMenu.add(getCheckItem("Drag All (Alt-drag)", "DragAll"));
        otherMenu.add(getCheckItem(isMac ? "Drag Row (Alt-S-drag, S-right)" : "Drag Row (S-right)", "DragRow"));
        otherMenu.add(getCheckItem(isMac ? "Drag Column (Alt-\u2318-drag, \u2318-right)" : "Drag Column (C-right)", "DragColumn"));
        otherMenu.add(getCheckItem("Drag Selected", "DragSelected"));
        otherMenu.add(getCheckItem("Drag Post (" + ctrlMetaKey + "-drag)", "DragPost"));

        return popupMenu;
    }

    public CheckboxMenuItem getClassCheckItem(Class elmClass)
    {
        CircuitElm elm = ElementBuilder.build(elmClass, 0, 0);

        String text = defineText(elm, elmClass);

        String classSignature = elmClass.getName();
        return getCheckItem(text, classSignature);
    }

    private String defineText(CircuitElm elm, Class elmClass)
    {
        String text = "Add ";
        try
        {
            text += (String)elmClass.getDeclaredField("NAME").get(null);
        }
        catch (NoSuchFieldException ee)
        {
            text = "Unnamed";
        }
        catch (IllegalAccessException ee)
        {
            text = "Access Error";
        }
        try
        {
            /**
             * Append hotkey:
             * Add Diode (d)
             */
            if (elm.hasHotkey() && elm.getDumpClass() == elmClass)
            {
                return text + " (" + (char) elm.getDumpType() + ")";
            }
            elm.delete();
        } catch (Exception ee)
        {
            ee.printStackTrace();
        }
        return text;
    }

    public CheckboxMenuItem getCheckItem(String label, String type)
    {
        CheckboxMenuItem menuItem = new CheckboxMenuItem(label);
        menuItem.addItemListener(sim);
        menuItem.setActionCommand(type);
        return menuItem;
    }
}
