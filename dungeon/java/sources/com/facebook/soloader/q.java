package com.facebook.soloader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31386b;

    q(String str, List list) {
        this.f31385a = str;
        this.f31386b = Collections.unmodifiableList(list);
    }

    public static q a(DataInputStream dataInputStream) throws IOException {
        String strC = c(dataInputStream);
        int i10 = dataInputStream.readShort() & 65535;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(d(dataInputStream));
        }
        return new q(strC, arrayList);
    }

    public static q b(InputStream inputStream) {
        return a(new DataInputStream(inputStream));
    }

    private static String c(DataInputStream dataInputStream) throws IOException {
        byte b10 = dataInputStream.readByte();
        if (b10 == 1) {
            return "arm64-v8a";
        }
        if (b10 == 2) {
            return "armeabi-v7a";
        }
        if (b10 == 3) {
            return "x86_64";
        }
        if (b10 == 4) {
            return "x86";
        }
        throw new RuntimeException("Unrecognized arch id: " + ((int) b10));
    }

    private static String d(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.readShort() & 65535];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
