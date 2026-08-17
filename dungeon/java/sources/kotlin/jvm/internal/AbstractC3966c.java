package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3966c {
    public static final Iterator a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new C3965b(array);
    }
}
