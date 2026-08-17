package Vb;

import kotlin.jvm.internal.Intrinsics;
import p013ac.s;
import p067dc.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f14256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f14257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14258d;

    public d(String name, s constructor, h objectDefinition, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(objectDefinition, "objectDefinition");
        this.f14255a = name;
        this.f14256b = constructor;
        this.f14257c = objectDefinition;
        this.f14258d = z10;
    }

    public final s a() {
        return this.f14256b;
    }

    public final String b() {
        return this.f14255a;
    }

    public final h c() {
        return this.f14257c;
    }

    public final boolean d() {
        return this.f14258d;
    }
}
