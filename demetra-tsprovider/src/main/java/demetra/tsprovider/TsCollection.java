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
package demetra.tsprovider;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Jean Palate
 */
@lombok.Value
@lombok.Builder(builderClassName = "Builder")
public final class TsCollection {

    @lombok.NonNull
    TsMoniker moniker;

    @lombok.NonNull
    TsInformationType type;

    String name;

    @lombok.Singular("meta")
    Map<String, String> metaData;

    @lombok.Singular
    List<Ts> items;

    public boolean hasData() {
        return type == TsInformationType.All || type == TsInformationType.Data;
    }

    public boolean hasDefinition() {
        return type == TsInformationType.All
                || type == TsInformationType.Definition
                || type == TsInformationType.BaseInformation;
    }

    public boolean hasMetaData() {
        return type == TsInformationType.All
                || type == TsInformationType.MetaData
                || type == TsInformationType.BaseInformation;
    }

    public static class Builder {

        public TsMoniker getMoniker() {
            return moniker;
        }

        public TsInformationType getType() {
            return type;
        }
    }
}
