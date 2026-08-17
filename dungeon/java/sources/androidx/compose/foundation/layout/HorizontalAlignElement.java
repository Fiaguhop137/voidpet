package androidx.compose.foundation.layout;

import A.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p324s0.X;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Ls0/X;", "LA/x;", "LV/d$b;", "horizontal", "<init>", "(LV/d$b;)V", "f", "()LA/x;", "node", "", "g", "(LA/x;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LV/d$b;", "getHorizontal", "()LV/d$b;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HorizontalAlignElement extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final V.d.b horizontal;

    public HorizontalAlignElement(V.d.b bVar) {
        this.horizontal = bVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = other instanceof HorizontalAlignElement ? (HorizontalAlignElement) other : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.b(this.horizontal, horizontalAlignElement.horizontal);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x c() {
        return new x(this.horizontal);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(x node) {
        node.X1(this.horizontal);
    }

    public int hashCode() {
        return this.horizontal.hashCode();
    }
}
