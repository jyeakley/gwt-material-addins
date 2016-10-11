/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.addins.client;

import gwt.material.design.addins.client.base.MaterialAddinsTest;
import gwt.material.design.addins.client.cutout.MaterialCutOut;
import gwt.material.design.client.base.HasCircle;
import gwt.material.design.client.base.HasColors;
import gwt.material.design.client.base.MaterialWidget;

public class MaterialCutoutTest extends MaterialAddinsTest {

    public void init() {
        MaterialCutOut cutOut = new MaterialCutOut();
        checkWidget(cutOut);
    }

    @Override
    protected <T extends MaterialWidget & HasColors> void checkColor(T widget) {
        // TODO Need specific init case
    }

    @Override
    protected <T extends MaterialWidget & HasCircle> void checkCircle(T widget) {
        // TODO Need specific circle
    }
}
