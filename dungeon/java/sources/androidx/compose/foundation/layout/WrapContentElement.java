package androidx.compose.foundation.layout;

import A.EnumC0786v;
import A.T;
import A.U;
import A.V;
import O0.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p324s0.X;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Ls0/X;", "Landroidx/compose/foundation/layout/s;", "LA/v;", "direction", "", "unbounded", "Lkotlin/Function2;", "LO0/r;", "LO0/t;", "LO0/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(LA/v;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", "f", "()Landroidx/compose/foundation/layout/s;", "node", "", "g", "(Landroidx/compose/foundation/layout/s;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LA/v;", "c", "Z", "d", "Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/Object;", "Ljava/lang/String;", "a", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapContentElement extends X {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC0786v direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2 alignmentCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final O0.n e(V.d.c cVar, O0.r rVar, t tVar) {
            return O0.n.c(O0.n.d((((long) 0) << 32) | (4294967295L & ((long) cVar.a(0, (int) (rVar.j() & 4294967295L))))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final O0.n g(V.d dVar, O0.r rVar, t tVar) {
            return O0.n.c(dVar.a(O0.r.f8289b.a(), rVar.j(), tVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final O0.n i(V.d.b bVar, O0.r rVar, t tVar) {
            return O0.n.c(O0.n.d((((long) bVar.a(0, (int) (rVar.j() >> 32), tVar)) << 32) | (((long) 0) & 4294967295L)));
        }

        public final WrapContentElement d(V.d.c cVar, boolean z10) {
            return new WrapContentElement(EnumC0786v.Vertical, z10, new U(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement f(V.d dVar, boolean z10) {
            return new WrapContentElement(EnumC0786v.Both, z10, new V(dVar), dVar, "wrapContentSize");
        }

        public final WrapContentElement h(V.d.b bVar, boolean z10) {
            return new WrapContentElement(EnumC0786v.Horizontal, z10, new T(bVar), bVar, "wrapContentWidth");
        }
    }

    public WrapContentElement(EnumC0786v enumC0786v, boolean z10, Function2 function2, Object obj, String str) {
        this.direction = enumC0786v;
        this.unbounded = z10;
        this.alignmentCallback = function2;
        this.align = obj;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && Intrinsics.b(this.align, wrapContentElement.align);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s c() {
        return new s(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(s node) {
        node.Z1(this.direction);
        node.a2(this.unbounded);
        node.Y1(this.alignmentCallback);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }
}
