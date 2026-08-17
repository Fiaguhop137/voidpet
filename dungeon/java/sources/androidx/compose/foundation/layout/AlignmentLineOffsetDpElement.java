package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p288q0.AbstractC4054a;
import p324s0.X;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Ls0/X;", "Landroidx/compose/foundation/layout/b;", "Lq0/a;", "alignmentLine", "LO0/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/J0;", "", "inspectorInfo", "<init>", "(Lq0/a;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "f", "()Landroidx/compose/foundation/layout/b;", "node", "g", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lq0/a;", "getAlignmentLine", "()Lq0/a;", "c", "F", "getBefore-D9Ej5fM", "()F", "d", "getAfter-D9Ej5fM", "e", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4054a alignmentLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    private AlignmentLineOffsetDpElement(AbstractC4054a abstractC4054a, float f10, float f11, Function1 function1) {
        this.alignmentLine = abstractC4054a;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = function1;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            B.a.a("Padding from alignment line must be a non-negative number");
        }
    }

    public /* synthetic */ AlignmentLineOffsetDpElement(AbstractC4054a abstractC4054a, float f10, float f11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4054a, f10, f11, function1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        return alignmentLineOffsetDpElement != null && Intrinsics.b(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && O0.h.r(this.before, alignmentLineOffsetDpElement.before) && O0.h.r(this.after, alignmentLineOffsetDpElement.after);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(b node) {
        node.X1(this.alignmentLine);
        node.Y1(this.before);
        node.W1(this.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + O0.h.s(this.before)) * 31) + O0.h.s(this.after);
    }
}
