package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements kotlin.reflect.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f48346e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.e f48347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.o f48349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48350d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48351a;

        static {
            int[] iArr = new int[kotlin.reflect.q.values().length];
            try {
                iArr[kotlin.reflect.q.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.q.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48351a = iArr;
        }
    }

    public N(kotlin.reflect.e classifier, List arguments, kotlin.reflect.o oVar, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f48347a = classifier;
        this.f48348b = arguments;
        this.f48349c = oVar;
        this.f48350d = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(kotlin.reflect.e classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    private final String m(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.d() == null) {
            return "*";
        }
        kotlin.reflect.o oVarC = kTypeProjection.c();
        N n10 = oVarC instanceof N ? (N) oVarC : null;
        if (n10 == null || (strValueOf = n10.o(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.c());
        }
        kotlin.reflect.q qVarD = kTypeProjection.d();
        int i10 = qVarD == null ? -1 : b.f48351a[qVarD.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new Ad.n();
        }
        return "out " + strValueOf;
    }

    private final String o(boolean z10) {
        String name;
        kotlin.reflect.e eVarE = e();
        kotlin.reflect.d dVar = eVarE instanceof kotlin.reflect.d ? (kotlin.reflect.d) eVarE : null;
        Class clsB = dVar != null ? Ld.a.b(dVar) : null;
        if (clsB == null) {
            name = e().toString();
        } else if ((this.f48350d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = r(clsB);
        } else if (z10 && clsB.isPrimitive()) {
            kotlin.reflect.e eVarE2 = e();
            Intrinsics.d(eVarE2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = Ld.a.c((kotlin.reflect.d) eVarE2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (k().isEmpty() ? "" : CollectionsKt.s0(k(), ", ", "<", ">", 0, null, new M(this), 24, null)) + (l() ? "?" : "");
        kotlin.reflect.o oVar = this.f48349c;
        if (!(oVar instanceof N)) {
            return str;
        }
        String strO = ((N) oVar).o(true);
        if (Intrinsics.b(strO, str)) {
            return str;
        }
        if (Intrinsics.b(strO, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strO + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(N n10, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return n10.m(it);
    }

    private final String r(Class cls) {
        if (Intrinsics.b(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.b(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.b(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.b(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.b(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.b(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.b(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.b(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.e e() {
        return this.f48347a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return Intrinsics.b(e(), n10.e()) && Intrinsics.b(k(), n10.k()) && Intrinsics.b(this.f48349c, n10.f48349c) && this.f48350d == n10.f48350d;
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        return CollectionsKt.l();
    }

    public int hashCode() {
        return (((e().hashCode() * 31) + k().hashCode()) * 31) + Integer.hashCode(this.f48350d);
    }

    @Override // kotlin.reflect.o
    public List k() {
        return this.f48348b;
    }

    @Override // kotlin.reflect.o
    public boolean l() {
        return (this.f48350d & 1) != 0;
    }

    public String toString() {
        return o(false) + " (Kotlin reflection is not available)";
    }
}
