package p121gc;

import Ld.a;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final boolean a(kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return SharedObject.class.isAssignableFrom(a.b(dVar));
    }
}
