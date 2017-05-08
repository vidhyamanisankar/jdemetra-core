/*
 * Copyright 2013 National Bank of Belgium
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
package demetra.maths.functions;

import demetra.data.DataBlock;
import demetra.design.Development;
import demetra.maths.matrices.Matrix;
import demetra.data.Doubles;


/**
 *
 * @author Jean Palate
 */
@Development(status = Development.Status.Preliminary)
public class TransformedFunction implements IFunction {

    class Point implements IFunctionPoint {

        private final IFunctionPoint yfx;

        Point(IFunctionPoint fx) {
            this.yfx = fx;
        }

        @Override
        public Doubles getParameters() {
            return yfx.getParameters();
        }

        @Override
        public double getValue() {
            return t.f(yfx.getValue());
        }

        @Override
        public IFunction getFunction() {
            return TransformedFunction.this;
        }

        @Override
        public IFunctionDerivatives derivatives() {
            return new Derivatives(yfx.derivatives(), getValue());
        }

    }

    class Derivatives implements IFunctionDerivatives {

        private final IFunctionDerivatives dfx;
        private final double fx;

        Derivatives(IFunctionDerivatives dfx, double fx) {
            this.dfx = dfx;
            this.fx = fx;
        }
        
        @Override
        public IFunction getFunction(){
            return TransformedFunction.this;
        }

        /**
         * F(y) = t(f(y)) dF/dyi = t'(f(y))*df/dyi
         *
         * @return
         */
        @Override
        public Doubles gradient() {
            DataBlock g = DataBlock.copyOf(dfx.gradient());
            double dt = t.df(fx);
            g.mul(dt);
            return g;
        }

        /**
         * F(y) = t(f(y)) dF/dyi = t'(f(y)*df/dyi d2F/dyi dyj =
         * t''(f(y))*df/dyi*df/dyj + t'(f(y))*d2f/dyi dyj
         *
         * @return
         */
        @Override
        public void hessian(Matrix H) {
            int n = getDomain().getDim();
            Matrix h = Matrix.square(n);
            dfx.hessian(h);
            Doubles grad = dfx.gradient();
            double dt = t.df(fx), d2t = t.d2f(fx);
            h.mul(dt);
            h.addXaXt(d2t, DataBlock.copyOf(grad));
            H.copy(h);
        }
    }

    /**
     * f(x) = a + b*x
     *
     * @param a
     * @param b
     * @return
     */
    public static ITransformation linearTransformation(final double a, final double b) {
        return new ITransformation() {

            @Override
            public double f(double x) {
                return a + b * x;
            }

            @Override
            public double df(double x) {
                return b;
            }

            @Override
            public double d2f(double x) {
                return 0;
            }
        };
    }

    public interface ITransformation {

        double f(double x);

        double df(double x);

        double d2f(double x);
    }

    private final ITransformation t;
    private final IFunction fn;

    public TransformedFunction(IFunction fn, ITransformation t) {
        this.fn = fn;
        this.t = t;
    }

    @Override
    public IFunctionPoint evaluate(Doubles parameters) {
        return new Point(fn.evaluate(parameters));
    }

    @Override
    public IParametersDomain getDomain() {
        return fn.getDomain();
    }

}
