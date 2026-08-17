package p157ic;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: renamed from: ic.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3598f {
    public static final boolean a(o type, Class clazz) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Intrinsics.b(clazz, boolean[].class) || Intrinsics.b(clazz, byte[].class) || Intrinsics.b(clazz, char[].class) || Intrinsics.b(clazz, short[].class) || Intrinsics.b(clazz, int[].class) || Intrinsics.b(clazz, long[].class) || Intrinsics.b(clazz, float[].class) || Intrinsics.b(clazz, double[].class)) {
            return type.k().isEmpty();
        }
        return false;
    }
}
