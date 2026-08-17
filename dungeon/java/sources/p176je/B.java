package p176je;

import Ad.h;
import Ad.v;
import kotlin.Pair;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f47201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f47202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f47203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f47204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c[] f47206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final K f47207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f47208h;

    static {
        c cVar = new c("org.jspecify.nullness");
        f47201a = cVar;
        c cVar2 = new c("org.jspecify.annotations");
        f47202b = cVar2;
        c cVar3 = new c("io.reactivex.rxjava3.annotations");
        f47203c = cVar3;
        c cVar4 = new c("org.checkerframework.checker.nullness.compatqual");
        f47204d = cVar4;
        String strA = cVar3.a();
        f47205e = strA;
        f47206f = new c[]{new c(strA + ".Nullable"), new c(strA + ".NonNull")};
        c cVar5 = new c("org.jetbrains.annotations");
        C.a aVar = C.f47209d;
        Pair pairA = v.a(cVar5, aVar.a());
        Pair pairA2 = v.a(new c("androidx.annotation"), aVar.a());
        Pair pairA3 = v.a(new c("android.support.annotation"), aVar.a());
        Pair pairA4 = v.a(new c("android.annotation"), aVar.a());
        Pair pairA5 = v.a(new c("com.android.annotations"), aVar.a());
        Pair pairA6 = v.a(new c("org.eclipse.jdt.annotation"), aVar.a());
        Pair pairA7 = v.a(new c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair pairA8 = v.a(cVar4, aVar.a());
        Pair pairA9 = v.a(new c("javax.annotation"), aVar.a());
        Pair pairA10 = v.a(new c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair pairA11 = v.a(new c("io.reactivex.annotations"), aVar.a());
        c cVar6 = new c("androidx.annotation.RecentlyNullable");
        O o10 = O.WARN;
        Pair pairA12 = v.a(cVar6, new C(o10, null, null, 4, null));
        Pair pairA13 = v.a(new c("androidx.annotation.RecentlyNonNull"), new C(o10, null, null, 4, null));
        Pair pairA14 = v.a(new c("lombok"), aVar.a());
        h hVar = new h(2, 1);
        O o11 = O.STRICT;
        f47207g = new M(N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, v.a(cVar, new C(o10, hVar, o11)), v.a(cVar2, new C(o10, new h(2, 1), o11)), v.a(cVar3, new C(o10, new h(1, 8), o11))));
        f47208h = new C(o10, null, null, 4, null);
    }

    public static final G a(h configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        C c10 = f47208h;
        O oC = (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
        return new G(oC, c(oC), null, 4, null);
    }

    public static /* synthetic */ G b(h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f315f;
        }
        return a(hVar);
    }

    public static final O c(O globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == O.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final O d(c annotationFqName) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        return h(annotationFqName, K.f47280a.a(), null, 4, null);
    }

    public static final c e() {
        return f47202b;
    }

    public static final c[] f() {
        return f47206f;
    }

    public static final O g(c annotation, K configuredReportLevels, h configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        O o10 = (O) configuredReportLevels.a(annotation);
        if (o10 != null) {
            return o10;
        }
        C c10 = (C) f47207g.a(annotation);
        if (c10 == null) {
            return O.IGNORE;
        }
        return (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
    }

    public static /* synthetic */ O h(c cVar, K k10, h hVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            hVar = new h(1, 7, 20);
        }
        return g(cVar, k10, hVar);
    }
}
