package G;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1000v f3267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f3268b;

    public O(C1000v drawerState, V snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f3267a = drawerState;
        this.f3268b = snackbarHostState;
    }

    public final C1000v a() {
        return this.f3267a;
    }

    public final V b() {
        return this.f3268b;
    }
}
