package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f30695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30696c;

    public c(int i10, RectF rectangle, int i11) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        this.f30694a = i10;
        this.f30695b = rectangle;
        this.f30696c = i11;
    }

    public final int a() {
        return this.f30696c;
    }

    public final int b() {
        return this.f30694a;
    }

    public final RectF c() {
        return this.f30695b;
    }
}
