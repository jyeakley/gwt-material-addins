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
package gwt.material.design.addins.client.combobox.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import gwt.material.design.addins.client.combobox.base.HasSelectionHandlers;

import java.util.List;

/**
 * Combobox event fired once user removes an item from multiple list selection.
 *
 * @author kevzlou7979
 */
public class UnselectItemEvent<T> extends GwtEvent<UnselectItemEvent.UnselectComboHandler<T>> {

    private static Type<UnselectItemEvent.UnselectComboHandler<?>> TYPE;

    public interface UnselectComboHandler<T> extends EventHandler {
        void onUnselectItem(UnselectItemEvent<T> event);
    }

    public static <T> void fire(HasSelectionHandlers<T> source, List<T> values) {
        if (TYPE != null) {
            source.fireEvent(new UnselectItemEvent<>(values));
        }
    }

    public static Type<UnselectItemEvent.UnselectComboHandler<?>> getType() {
        return TYPE != null ? TYPE : (TYPE = new Type<>());
    }

    private final List<T> values;

    protected UnselectItemEvent(List<T> values) {
        this.values = values;
    }

    @Override
    public final Type<UnselectItemEvent.UnselectComboHandler<T>> getAssociatedType() {
        return (Type) TYPE;
    }

    public List<T> getSelectedValues() {
        return values;
    }

    @Override
    protected void dispatch(UnselectItemEvent.UnselectComboHandler<T> handler) {
        handler.onUnselectItem(this);
    }
}
