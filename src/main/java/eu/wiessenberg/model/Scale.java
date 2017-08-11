package eu.wiessenberg.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Scale {
    private List<Interval> formula = new ArrayList<>(12);

    public Scale(List<Interval> formula) {
        this.formula = formula;
    }

    public List<Interval> getFormula() {
        return formula;
    }
}
