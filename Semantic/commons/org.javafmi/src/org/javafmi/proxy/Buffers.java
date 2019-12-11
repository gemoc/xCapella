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

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

public class Buffers {
    public static final int CAPACITY = 128;

    private DoubleBuffer doubleBuffer;
    private IntBuffer intBuffer;
    private ByteBuffer byteBuffer;

    public Buffers() {
        this.intBuffer = IntBuffer.allocate(CAPACITY);
        this.doubleBuffer = DoubleBuffer.allocate(CAPACITY);
        this.byteBuffer = ByteBuffer.allocate(CAPACITY);
    }

    public DoubleBuffer forDouble(int length) {
        int capacity = doubleBuffer.capacity();
        if (capacity < length)
            doubleBuffer = DoubleBuffer.allocate(capacity + length);
        return doubleBuffer;
    }

    public IntBuffer forInteger(int length) {
        int capacity = intBuffer.capacity();
        if (capacity < length)
            intBuffer = IntBuffer.allocate(capacity + length);
        return intBuffer;
    }

    public ByteBuffer forBytes(int length) {
        int capacity = byteBuffer.capacity();
        if (capacity < length)
            byteBuffer = ByteBuffer.allocate(capacity + length);
        return byteBuffer;
    }
}
