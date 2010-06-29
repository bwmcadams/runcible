package runcible.test.monsters;

import java.util.ArrayList;
import java.util.List;

/**
   Another typical Java class that implements the "builder" pattern by
raking in a number of Monstrosity instances &amp; does something with
them in aggregate.
**/
public class Syndicate {
    private List<Monstrosity> minions;

    private Syndicate() {
        minions = new ArrayList<Monstrosity>();
    }

    public static Syndicate start() {
        return new Syndicate();
    }

    public Syndicate and(Monstrosity m) {
        minions.add(m);
        return this;
    }

    public String finish() {
        StringBuilder sb = new StringBuilder();
        for (Monstrosity m : minions) {
            if (sb.length() > 0)
                sb.append(", ");
            sb.append(m.frobnicate());
        }
        return "so: " + sb + "; and that is all.";
    }
}
