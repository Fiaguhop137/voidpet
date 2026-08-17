package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMap f30382a;

    public X(ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.f30382a = props;
    }

    public final boolean a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30382a.isNull(name) ? z10 : this.f30382a.getBoolean(name);
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30382a.getString(name);
    }

    public final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30382a.hasKey(name);
    }

    public final ReadableMap d() {
        return this.f30382a;
    }

    public String toString() {
        return "{ " + X.class.getSimpleName() + ": " + this.f30382a + " }";
    }
}
