/*

 Copyright 2013-2015 SIANI - ULPGC
 Jose Juan Hernandez Cabrera
 Jose Evora Gomez
 Johan Sebastian Cortes Montenegro

 This File is Part of JavaFMI Project

 JavaFMI Project is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License.

 JavaFMI Project is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with JavaFMI.  If not, see <http://www.gnu.org/licenses/>.

 */
 package org.javafmi.modeldescription.v2;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class EnumerationType extends SimpleType {

    @Attribute(required = false)
    private String declaredType;
    @Attribute(required = false)
    private String quantity;
    @Attribute(required = false)
    private Integer min;
    @Attribute(required = false)
    private Integer max;
    @Attribute(required = false)
    private Integer start;
    @ElementList(inline = true, required = false, entry = "Item")
    private List<Item> items;

    public Integer getStart() {
        return start;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getDeclaredType() {
        return declaredType;
    }

    public static class Item {
        @Attribute(required = false)
        private String name;
        @Attribute(required = false)
        private String value;
        @Attribute(required = false)
        private String description;

        public String getName() {
            return name;
        }
    }

    public String getQuantity() {
        return quantity;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
