package p323s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4113m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4112l f52737a = new E(0);

    public static final AbstractC4112l a(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        E e10 = new E(elements.length);
        e10.g(e10.f52736b, elements);
        return e10;
    }

    public static final E b(int i10) {
        E e10 = new E(1);
        e10.f(i10);
        return e10;
    }
}
