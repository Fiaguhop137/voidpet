package p121gc;

import Ld.a;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final boolean a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return SharedRef.class.isAssignableFrom(a.b(dVar));
    }
}
