/*
 * Copyright 2016 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package demetra.stats.samples;

import demetra.data.DoubleReader;
import demetra.data.DoubleSequence;
import demetra.data.Doubles;

/**
 *
 * @author Jean Palate
 */
@lombok.experimental.UtilityClass
public class SamplesUtility {

    /**
     * compute the covariance of x and y
     *
     * @param x
     * @param sx
     * @param y
     * @param sy
     * @param n
     * @return
     */
    public double cov(DoubleSequence x, DoubleSequence y) {
        double v = 0;
        int nm = 0;
        int n = x.length();
        DoubleReader xcur = x.reader();
        DoubleReader ycur = y.reader();
        for (int i = 0; i < n; ++i) {
            double xval = xcur.next();
            double yval = ycur.next();
            if (Double.isFinite(xval) && Double.isFinite(yval)) {
                v += xval * yval;
            } else {
                ++nm;
            }
        }
        n -= nm;
        if (n == 0) {
            return 0;
        }
        return v / n;
    }

    /**
     * compute the covariance of (x (from sx to sx+n), y(from sy to sy+n)
     *
     * @param x
     * @param y
     * @return
     */
    public double covNoMissing(DoubleSequence x, DoubleSequence y) {
        return Doubles.dot(x, y);
    }

}