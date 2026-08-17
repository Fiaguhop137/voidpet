package M9;

import kotlin.jvm.internal.Intrinsics;
import p451z1.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final Object a(f fVar, f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object objB = fVar.b(key);
        return objB == null ? obj : objB;
    }
}
