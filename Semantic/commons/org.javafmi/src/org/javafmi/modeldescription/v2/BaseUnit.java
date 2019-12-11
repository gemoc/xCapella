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

public class BaseUnit {

    @Attribute(required = false)
    private int kg;
    @Attribute(required = false)
    private int m;
    @Attribute(required = false)
    private int s;
    @Attribute(name = "A", required = false)
    private int a;
    @Attribute(name = "K", required = false)
    private int k;
    @Attribute(required = false)
    private int mol;
    @Attribute(required = false)
    private int cd;
    @Attribute(required = false)
    private int rad;
    @Attribute(required = false)
    private double factor;
    @Attribute(required = false)
    private double offset;
}
