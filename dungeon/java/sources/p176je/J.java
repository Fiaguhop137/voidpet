package p176je;

import Ad.v;
import Xd.o;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.N;
import kotlin.collections.W;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f47255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f47256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f47257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f47258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f47259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f47260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f47261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f47262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f47263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c f47264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c f47265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c f47266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f47267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f47268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final c f47269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c f47270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Set f47271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set f47272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set f47273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f47274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set f47275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set f47276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Set f47277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f47278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final c f47279y;

    static {
        c cVar = new c("org.jspecify.nullness.Nullable");
        f47255a = cVar;
        c cVar2 = new c("org.jspecify.nullness.NullMarked");
        f47256b = cVar2;
        c cVar3 = new c("org.jspecify.nullness.NullnessUnspecified");
        f47257c = cVar3;
        c cVar4 = new c("org.jspecify.annotations.NonNull");
        f47258d = cVar4;
        c cVar5 = new c("org.jspecify.annotations.Nullable");
        f47259e = cVar5;
        c cVar6 = new c("org.jspecify.annotations.NullMarked");
        f47260f = cVar6;
        c cVar7 = new c("org.jspecify.annotations.NullnessUnspecified");
        f47261g = cVar7;
        c cVar8 = new c("org.jspecify.annotations.NullUnmarked");
        f47262h = cVar8;
        f47263i = new c("javax.annotation.meta.TypeQualifier");
        f47264j = new c("javax.annotation.meta.TypeQualifierNickname");
        f47265k = new c("javax.annotation.meta.TypeQualifierDefault");
        c cVar9 = new c("javax.annotation.Nonnull");
        f47266l = cVar9;
        c cVar10 = new c("javax.annotation.Nullable");
        f47267m = cVar10;
        c cVar11 = new c("javax.annotation.CheckForNull");
        f47268n = cVar11;
        f47269o = new c("javax.annotation.ParametersAreNonnullByDefault");
        f47270p = new c("javax.annotation.ParametersAreNullableByDefault");
        f47271q = W.g(cVar9, cVar11);
        Set setG = W.g(I.f47243l, cVar4, new c("android.annotation.NonNull"), new c("androidx.annotation.NonNull"), new c("androidx.annotation.RecentlyNonNull"), new c("android.support.annotation.NonNull"), new c("com.android.annotations.NonNull"), new c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new c("org.checkerframework.checker.nullness.qual.NonNull"), new c("edu.umd.cs.findbugs.annotations.NonNull"), new c("io.reactivex.annotations.NonNull"), new c("io.reactivex.rxjava3.annotations.NonNull"), new c("org.eclipse.jdt.annotation.NonNull"), new c("lombok.NonNull"));
        f47272r = setG;
        Set setG2 = W.g(I.f47244m, cVar, cVar5, cVar10, cVar11, new c("android.annotation.Nullable"), new c("androidx.annotation.Nullable"), new c("androidx.annotation.RecentlyNullable"), new c("android.support.annotation.Nullable"), new c("com.android.annotations.Nullable"), new c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new c("org.checkerframework.checker.nullness.qual.Nullable"), new c("edu.umd.cs.findbugs.annotations.Nullable"), new c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new c("edu.umd.cs.findbugs.annotations.CheckForNull"), new c("io.reactivex.annotations.Nullable"), new c("io.reactivex.rxjava3.annotations.Nullable"), new c("org.eclipse.jdt.annotation.Nullable"));
        f47273s = setG2;
        f47274t = W.g(cVar3, cVar7);
        f47275u = W.k(W.k(W.k(W.k(W.j(W.j(new LinkedHashSet(), setG), setG2), cVar9), cVar2), cVar6), cVar8);
        f47276v = W.g(I.f47246o, I.f47247p);
        f47277w = W.g(I.f47245n, I.f47248q);
        f47278x = N.l(v.a(I.f47235d, o.a.f16362H), v.a(I.f47237f, o.a.f16370L), v.a(I.f47239h, o.a.f16444y), v.a(I.f47240i, o.a.f16378P));
        f47279y = new c("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set a() {
        return f47271q;
    }

    public static final Set b() {
        return f47274t;
    }

    public static final c c() {
        return f47266l;
    }

    public static final c d() {
        return f47269o;
    }

    public static final c e() {
        return f47270p;
    }

    public static final c f() {
        return f47263i;
    }

    public static final c g() {
        return f47265k;
    }

    public static final c h() {
        return f47264j;
    }

    public static final c i() {
        return f47260f;
    }

    public static final c j() {
        return f47262h;
    }

    public static final c k() {
        return f47256b;
    }

    public static final Set l() {
        return f47277w;
    }

    public static final Set m() {
        return f47272r;
    }

    public static final Set n() {
        return f47273s;
    }

    public static final Set o() {
        return f47276v;
    }

    public static final c p() {
        return f47279y;
    }
}
