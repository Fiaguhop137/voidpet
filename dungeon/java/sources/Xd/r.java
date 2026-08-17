package Xd;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f16457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f16458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f16459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f16460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f16461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16462i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.b f16463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p464ze.f f16464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p464ze.b f16465c;

    static {
        ze.b.a aVar = p464ze.b.f58558d;
        f16457d = new r("UBYTE", 0, ze.b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f16458e = new r("USHORT", 1, ze.b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f16459f = new r("UINT", 2, ze.b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f16460g = new r("ULONG", 3, ze.b.a.b(aVar, "kotlin/ULong", false, 2, null));
        r[] rVarArrE = e();
        f16461h = rVarArrE;
        f16462i = Gd.a.a(rVarArrE);
    }

    private r(String str, int i10, p464ze.b bVar) {
        super(str, i10);
        this.f16463a = bVar;
        p464ze.f fVarH = bVar.h();
        this.f16464b = fVarH;
        p464ze.c cVarF = bVar.f();
        p464ze.f fVarP = p464ze.f.p(fVarH.g() + "Array");
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        this.f16465c = new p464ze.b(cVarF, fVarP);
    }

    private static final /* synthetic */ r[] e() {
        return new r[]{f16457d, f16458e, f16459f, f16460g};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f16461h.clone();
    }

    public final p464ze.b g() {
        return this.f16465c;
    }

    public final p464ze.b h() {
        return this.f16463a;
    }

    public final p464ze.f i() {
        return this.f16464b;
    }
}
