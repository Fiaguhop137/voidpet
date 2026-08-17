package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f37675a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f37676b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f37677c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f37678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f37679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3143i f37680f;

    public interface a extends i {
        @Override // com.google.protobuf.A.i
        a f(int i10);
    }

    public interface b extends i {
        @Override // com.google.protobuf.A.i
        b f(int i10);
    }

    public interface c {
        int getNumber();
    }

    public interface d {
        c a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i {
        @Override // com.google.protobuf.A.i
        f f(int i10);
    }

    public interface g extends i {
        @Override // com.google.protobuf.A.i
        g f(int i10);
    }

    public interface h extends i {
        @Override // com.google.protobuf.A.i
        h f(int i10);
    }

    public interface i extends List, RandomAccess {
        boolean O();

        i f(int i10);

        void z();
    }

    static {
        byte[] bArr = new byte[0];
        f37678d = bArr;
        f37679e = ByteBuffer.wrap(bArr);
        f37680f = AbstractC3143i.l(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return A0.s(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((T) obj).toBuilder().e0((T) obj2).G();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f37676b);
    }
}
