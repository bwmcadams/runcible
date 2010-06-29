package runcible.test.monsters;

import java.util.ArrayList;
import java.util.Collection;

/**
   A typical imperative, mutable Java class that so many (otherwise
   awesome) Java libraries are littred with.
**/
public class Monstrosity {
    private String field1;
    private int field2;
    private Collection<Long> field3;

    public Monstrosity() {
        field1 = "some default value";
        field2 = -1;
        field3 = new ArrayList<Long>();
    }

    public String getField1() { return field1; }
    public void setField1(String v) { field1 = v; }

    public int getField2() { return field2; }
    public void setField2(int v) { field2 = v; }

    public Collection<Long> getField3() { return field3; }
    public void setField3(Collection<Long> v) { field3 = v; }

    public String frobnicate() {
        return "ohai, " + field1 + " (" + field2
            + "), but also " + field3 + "!";
    }
}
