package P1;

import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements S.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8580b = new b();

    private b() {
    }

    @Override // androidx.lifecycle.S.c
    public Q b(kotlin.reflect.d modelClass, O1.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return c.f8581a.a(Ld.a.b(modelClass));
    }
}
