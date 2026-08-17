package com.facebook.react.defaults;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29558a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p312r6.e f29559b = p312r6.e.STABLE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f29560c;

    private a() {
    }

    public static final boolean a() {
        return f29560c;
    }

    public final void b(p312r6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        f29559b = eVar;
    }
}
