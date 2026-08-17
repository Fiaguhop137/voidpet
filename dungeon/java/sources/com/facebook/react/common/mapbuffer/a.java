package com.facebook.react.common.mapbuffer;

import kotlin.enums.EnumEntries;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends Iterable, Nd.a {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final C0374a f29538o1 = C0374a.f29539a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0374a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0374a f29539a = new C0374a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final IntRange f29540b = new IntRange(0, 65535);

        private C0374a() {
        }

        public final IntRange a() {
            return f29540b;
        }
    }

    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP,
        LONG;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f29548h = Gd.a.a(e());
    }

    public interface c {
        double a();

        String b();

        a c();

        boolean d();

        int f();

        int getKey();

        b getType();

        long k();
    }

    a D1(int i10);

    boolean S(int i10);

    boolean getBoolean(int i10);

    int getCount();

    double getDouble(int i10);

    int getInt(int i10);

    String getString(int i10);
}
