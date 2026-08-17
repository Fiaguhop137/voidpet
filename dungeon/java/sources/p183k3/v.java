package p183k3;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f47949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f47950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h.c f47951d;

    public v(String str, File file, Callable callable, h.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f47948a = str;
        this.f47949b = file;
        this.f47950c = callable;
        this.f47951d = mDelegate;
    }

    @Override // q3.h.c
    public h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new u(configuration.f51416a, this.f47948a, this.f47949b, this.f47950c, configuration.f51418c.f51414a, this.f47951d.a(configuration));
    }
}
