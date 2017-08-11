package eu.wiessenberg.model.scales;

import eu.wiessenberg.model.Scale;

import java.util.Arrays;

import static eu.wiessenberg.model.Interval.MAJOR_SECOND;
import static eu.wiessenberg.model.Interval.MAJOR_SEVENTH;
import static eu.wiessenberg.model.Interval.MAJOR_SIXTH;
import static eu.wiessenberg.model.Interval.MAJOR_THIRD;
import static eu.wiessenberg.model.Interval.PERFECT_FIFTH;
import static eu.wiessenberg.model.Interval.PERFECT_FOURTH;
import static eu.wiessenberg.model.Interval.ROOT;

public class MajorScale extends Scale {
    public MajorScale() {
        super(Arrays.asList(ROOT,
                MAJOR_SECOND,
                MAJOR_THIRD,
                PERFECT_FOURTH,
                PERFECT_FIFTH,
                MAJOR_SIXTH,
                MAJOR_SEVENTH));
    }

}
