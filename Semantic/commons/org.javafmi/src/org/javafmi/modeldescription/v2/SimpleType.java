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

import org.javafmi.modeldescription.ModelDescriptionException;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class SimpleType implements org.javafmi.modeldescription.SimpleType {

	@Attribute(required = false)
	String name;
	@Attribute(required = false)
	String description;
	@Element(name = "Real", required = false)
	private RealType real;
	@Element(name = "Integer", required = false)
	private IntegerType integer;
	@Element(name = "Boolean", required = false)
	private BooleanType booleann;
	@Element(name = "String", required = false)
	private StringType string;
	@Element(name = "Enumeration", required = false)
	private EnumerationType enumeration;
	
	@Override
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public SimpleType getType() {
		if (real != null)
			return real;
		if (integer != null)
			return integer;
		if (booleann != null)
			return booleann;
		if (string != null)
			return string;
		if (enumeration != null)
			return enumeration;
		throw new ModelDescriptionException("The type is mandatory but not present");
	}

	public Object getStart() {
		return getType().getStart();
	}
}
