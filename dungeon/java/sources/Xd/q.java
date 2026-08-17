package Xd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f16449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f16450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f16451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f16452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ q[] f16453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16454h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.b f16455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p464ze.f f16456b;

    static {
        ze.b.a aVar = p464ze.b.f58558d;
        f16449c = new q("UBYTEARRAY", 0, ze.b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f16450d = new q("USHORTARRAY", 1, ze.b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f16451e = new q("UINTARRAY", 2, ze.b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f16452f = new q("ULONGARRAY", 3, ze.b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        q[] qVarArrE = e();
        f16453g = qVarArrE;
        f16454h = Gd.a.a(qVarArrE);
    }

    private q(String str, int i10, p464ze.b bVar) {
        super(str, i10);
        this.f16455a = bVar;
        this.f16456b = bVar.h();
    }

    private static final /* synthetic */ q[] e() {
        return new q[]{f16449c, f16450d, f16451e, f16452f};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f16453g.clone();
    }

    public final p464ze.f g() {
        return this.f16456b;
    }
}
