package Xd;

import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.W;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 Xd.l, still in use, count: 1, list:
  (r4v0 Xd.l) from 0x0074: FILLED_NEW_ARRAY (r4v0 Xd.l), (r5v0 Xd.l), (r6v0 Xd.l), (r7v0 Xd.l), (r8v0 Xd.l), (r9v0 Xd.l), (r10v0 Xd.l) A[WRAPPED] elemType: Xd.l
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.f f16294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p464ze.f f16295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f16296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f16297d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16293p = Gd.a.a(e());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f16282e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f16283f = W.g(new l("Char"), new l("Byte"), new l("Short"), new l("Int"), new l("Float"), new l("Long"), new l("Double"));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
    }

    private l(String str) {
        super(str, i);
        p464ze.f fVarP = p464ze.f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        this.f16294a = fVarP;
        p464ze.f fVarP2 = p464ze.f.p(str + "Array");
        Intrinsics.checkNotNullExpressionValue(fVarP2, "identifier(...)");
        this.f16295b = fVarP2;
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f16296c = Ad.j.a(mVar, new j(this));
        this.f16297d = Ad.j.a(mVar, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p464ze.c i(l lVar) {
        return o.f16312A.b(lVar.f16295b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p464ze.c t(l lVar) {
        return o.f16312A.b(lVar.f16294a);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f16292o.clone();
    }

    public final p464ze.c o() {
        return (p464ze.c) this.f16297d.getValue();
    }

    public final p464ze.f p() {
        return this.f16295b;
    }

    public final p464ze.c r() {
        return (p464ze.c) this.f16296c.getValue();
    }

    public final p464ze.f s() {
        return this.f16294a;
    }
}
