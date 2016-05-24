/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.tstoolkit.modelling.arima.demetra;

import data.Data;
import ec.tstoolkit.arima.ArimaModelBuilder;
import ec.tstoolkit.data.ReadDataBlock;
import ec.tstoolkit.modelling.DefaultTransformationType;
import ec.tstoolkit.modelling.arima.ModelDescription;
import ec.tstoolkit.modelling.arima.ModellingContext;
import ec.tstoolkit.sarima.SarimaModel;
import ec.tstoolkit.sarima.SarimaSpecification;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Palate <jean.palate@nbb.be>
 */
public class DifferencingModuleTest {
    
    public DifferencingModuleTest() {
    }

    @Test
    public void testSomeMethod() {
        ModellingContext context = new ModellingContext();
        context.automodelling = true;
        context.hasseas = true;
        context.description = new ModelDescription(Data.M3, null);
 //       context.description.setAirline(true);
        context.description.setTransformation(DefaultTransformationType.Log);
        DifferencingModule diff=new DifferencingModule();
        diff.process(context);
        System.out.println(diff.getD());
        System.out.println(diff.getBD());
        System.out.println(diff.getTmean());
        System.out.println(diff.isMeanCorrection());
    }
    
    @Test
    public void testBAR() {
        SarimaSpecification xspec=new SarimaSpecification(12);
        xspec.setBP(1);
        SarimaModel model=new SarimaModel(xspec);
        model.setBPhi(1, -.7);
        ArimaModelBuilder builder=new ArimaModelBuilder();
        double[] data = builder.generate(model, 240);
        DifferencingModule diff=new DifferencingModule();
        diff.process(new ReadDataBlock(data), 12);
        System.out.println(diff.getD());
        System.out.println(diff.getBD());
        System.out.println(diff.getTmean());
        System.out.println(diff.isMeanCorrection());
    }
}
