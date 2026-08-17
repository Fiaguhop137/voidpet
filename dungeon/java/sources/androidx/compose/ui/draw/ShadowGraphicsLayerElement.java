package androidx.compose.ui.draw;

import O0.h;
import androidx.compose.ui.graphics.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p037c0.O;
import p037c0.Z;
import p037c0.x0;
import p324s0.X;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b2\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Ls0/X;", "Lc0/O;", "LO0/h;", "elevation", "Lc0/x0;", "shape", "", "clip", "Lc0/Z;", "ambientColor", "spotColor", "<init>", "(FLc0/x0;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/f;", "", "g", "()Lkotlin/jvm/functions/Function1;", "f", "()Lc0/O;", "node", "m", "(Lc0/O;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "j", "()F", "c", "Lc0/x0;", "k", "()Lc0/x0;", "d", "Z", "i", "()Z", "e", "J", "h", "()J", "l", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final x0 shape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    static final class a extends o implements Function1 {
        a() {
            super(1);
        }

        public final void a(f fVar) {
            fVar.v(fVar.e1(ShadowGraphicsLayerElement.this.getElevation()));
            fVar.V(ShadowGraphicsLayerElement.this.getShape());
            fVar.n(ShadowGraphicsLayerElement.this.getClip());
            fVar.k(ShadowGraphicsLayerElement.this.getAmbientColor());
            fVar.o(ShadowGraphicsLayerElement.this.getSpotColor());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f) obj);
            return Unit.f48228a;
        }
    }

    private ShadowGraphicsLayerElement(float f10, x0 x0Var, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = x0Var;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, x0 x0Var, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, x0Var, z10, j10, j11);
    }

    private final Function1 g() {
        return new a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return h.r(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Z.m(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Z.m(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public O c() {
        return new O(g());
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    public int hashCode() {
        return (((((((h.s(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Z.s(this.ambientColor)) * 31) + Z.s(this.spotColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final x0 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // p324s0.X
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void d(O node) {
        node.Y1(g());
        node.X1();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) h.t(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Z.t(this.ambientColor)) + ", spotColor=" + ((Object) Z.t(this.spotColor)) + ')';
    }
}
