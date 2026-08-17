package androidx.compose.ui.draw;

import Z.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p324s0.X;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Ls0/X;", "LZ/b;", "Lkotlin/Function1;", "Le0/f;", "", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "f", "()LZ/b;", "node", "g", "(LZ/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawBehindElement extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 onDraw;

    public DrawBehindElement(Function1 function1) {
        this.onDraw = function1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawBehindElement) && this.onDraw == ((DrawBehindElement) other).onDraw;
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this.onDraw);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(b node) {
        node.W1(this.onDraw);
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }
}
