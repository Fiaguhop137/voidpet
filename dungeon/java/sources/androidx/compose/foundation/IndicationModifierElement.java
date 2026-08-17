package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p324s0.X;
import p395w.s;
import p431y.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Ls0/X;", "Landroidx/compose/foundation/h;", "Ly/i;", "interactionSource", "Lw/s;", "indication", "<init>", "(Ly/i;Lw/s;)V", "f", "()Landroidx/compose/foundation/h;", "node", "", "g", "(Landroidx/compose/foundation/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ly/i;", "c", "Lw/s;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndicationModifierElement extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i interactionSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s indication;

    public IndicationModifierElement(i iVar, s sVar) {
        this.interactionSource = iVar;
        this.indication = sVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) other;
        return Intrinsics.b(this.interactionSource, indicationModifierElement.interactionSource) && Intrinsics.b(this.indication, indicationModifierElement.indication);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h c() {
        return new h(this.indication.a(this.interactionSource));
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(h node) {
        node.c2(this.indication.a(this.interactionSource));
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }
}
