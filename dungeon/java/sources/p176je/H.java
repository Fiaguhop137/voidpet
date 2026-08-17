package p176je;

import Ze.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p464ze.b;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f47227a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f47228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f47230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f47231e;

    static {
        c cVar = new c("kotlin.jvm.JvmField");
        f47228b = cVar;
        b.a aVar = b.f58558d;
        f47229c = aVar.c(cVar);
        f47230d = aVar.c(new c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f47231e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private H() {
    }

    public static final String b(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + a.a(propertyName);
    }

    public static final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.O(name, "get", false, 2, null) || StringsKt.O(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.O(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strA, "substring(...)");
        } else {
            strA = a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!StringsKt.O(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return Intrinsics.e(97, cCharAt) > 0 || Intrinsics.e(cCharAt, 122) > 0;
    }

    public final b a() {
        return f47231e;
    }
}
