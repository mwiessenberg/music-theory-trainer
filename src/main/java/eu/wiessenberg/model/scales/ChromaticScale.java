package eu.wiessenberg.model.scales;

import eu.wiessenberg.model.Scale;

import java.util.Arrays;

import static eu.wiessenberg.model.Interval.MAJOR_SECOND;
import static eu.wiessenberg.model.Interval.MAJOR_SEVENTH;
import static eu.wiessenberg.model.Interval.MAJOR_SIXTH;
import static eu.wiessenberg.model.Interval.MAJOR_THIRD;
import static eu.wiessenberg.model.Interval.MINOR_SECOND;
import static eu.wiessenberg.model.Interval.MINOR_SEVENTH;
import static eu.wiessenberg.model.Interval.MINOR_SIXTH;
import static eu.wiessenberg.model.Interval.MINOR_THIRD;
import static eu.wiessenberg.model.Interval.PERFECT_FIFTH;
import static eu.wiessenberg.model.Interval.PERFECT_FOURTH;
import static eu.wiessenberg.model.Interval.ROOT;
import static eu.wiessenberg.model.Interval.TRITONE;

public class ChromaticScale extends Scale {
    public ChromaticScale() {
        super(Arrays.asList(ROOT,
                MINOR_SECOND,
                MAJOR_SECOND,
                MINOR_THIRD,
                MAJOR_THIRD,
                PERFECT_FOURTH,
                TRITONE,
                PERFECT_FIFTH,
                MINOR_SIXTH,
                MAJOR_SIXTH,
                MINOR_SEVENTH,
                MAJOR_SEVENTH));
    }
}
