/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.steps;

import org.primefaces.component.menu.AbstractMenu;
import org.primefaces.util.ComponentUtils;


abstract class StepsBase extends AbstractMenu implements org.primefaces.component.api.Widget {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.StepsRenderer";

    public enum PropertyKeys {

        widgetVar,
        model,
        style,
        styleClass,
        activeIndex,
        readonly
    }

    public StepsBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public java.lang.String getWidgetVar() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(java.lang.String _widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
    }

    @Override
    public org.primefaces.model.menu.MenuModel getModel() {
        return (org.primefaces.model.menu.MenuModel) getStateHelper().eval(PropertyKeys.model, null);
    }

    public void setModel(org.primefaces.model.menu.MenuModel _model) {
        getStateHelper().put(PropertyKeys.model, _model);
    }

    public java.lang.String getStyle() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.style, null);
    }

    public void setStyle(java.lang.String _style) {
        getStateHelper().put(PropertyKeys.style, _style);
    }

    public java.lang.String getStyleClass() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.styleClass, null);
    }

    public void setStyleClass(java.lang.String _styleClass) {
        getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }

    public int getActiveIndex() {
        return (java.lang.Integer) getStateHelper().eval(PropertyKeys.activeIndex, 0);
    }

    public void setActiveIndex(int _activeIndex) {
        getStateHelper().put(PropertyKeys.activeIndex, _activeIndex);
    }

    public boolean isReadonly() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.readonly, true);
    }

    public void setReadonly(boolean _readonly) {
        getStateHelper().put(PropertyKeys.readonly, _readonly);
    }

    @Override
    public String resolveWidgetVar() {
        return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
    }
}