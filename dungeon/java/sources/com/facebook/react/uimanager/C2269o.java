package com.facebook.react.uimanager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2269o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2269o f30540a = new C2269o();

    private C2269o() {
    }

    public static final boolean a(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) && Float.isNaN(f11);
        }
        return Math.abs(f11 - f10) < 1.0E-5f;
    }

    public static final boolean b(Float f10, Float f11) {
        if (f10 == null) {
            return f11 == null;
        }
        if (f11 == null) {
            return false;
        }
        return a(f10.floatValue(), f11.floatValue());
    }
}
