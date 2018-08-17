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
package org.primefaces.component.breadcrumb;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

@ResourceDependencies({
        @ResourceDependency(library = "primefaces", name = "components.css"),
        @ResourceDependency(library = "primefaces", name = "jquery/jquery.js"),
        @ResourceDependency(library = "primefaces", name = "core.js"),
        @ResourceDependency(library = "primefaces", name = "components.js")
})
public class BreadCrumb extends BreadCrumbBase implements org.primefaces.component.api.Widget {


    public static final String COMPONENT_TYPE = "org.primefaces.component.BreadCrumb";

    public final static String CONTAINER_CLASS = "ui-breadcrumb ui-module ui-widget ui-widget-header ui-helper-clearfix ui-corner-all";
    public final static String CHEVRON_CLASS = "ui-breadcrumb-chevron ui-icon ui-icon-triangle-1-e";
    public final static String OPTIONS_CLASS = "ui-breadcrumb-options";
}