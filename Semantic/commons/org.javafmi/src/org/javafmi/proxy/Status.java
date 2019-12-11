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
 package org.javafmi.proxy;

public class Status {

    public static final Status OK = new Status("ok", 0);
    public static final Status WARNING = new Status("warning", 1);
    public static final Status DISCARD = new Status("discard", 2);
    public static final Status ERROR = new Status("error", 3);
    public static final Status FATAL = new Status("fatal", 4);
    public static final Status PENDING = new Status("pending", 5);
    private static Status[] status = {OK, WARNING, DISCARD, ERROR, FATAL, PENDING};
    private String value;
    private int code;

    public Status(String value, int code) {
        this.value = value;
        this.code = code;
    }

    public static Status translateStatus(Integer code) {
        return status[code];
    }

    public String getValue() {
        return value;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return value;
    }
}
