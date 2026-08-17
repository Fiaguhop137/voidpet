package p088ef;

import p195kf.E;
import p195kf.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f40803a = E.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Y f40804b = b();

    public static final Y a() {
        return f40804b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Y b() {
        if (!f40803a) {
            return U.f40801i;
        }
        L0 l0C = C3282e0.c();
        return (t.c(l0C) || !(l0C instanceof Y)) ? U.f40801i : (Y) l0C;
    }
}
