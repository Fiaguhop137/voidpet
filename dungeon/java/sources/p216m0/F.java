package p216m0;

import O0.r;
import org.jetbrains.annotations.Nullable;
import p288q0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final int $stable = 8;
    private boolean isAttached;

    @Nullable
    private m layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @Nullable
    public final m getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public abstract boolean getShareWithSiblings();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m269getSizeYbymL2g() {
        m mVar = this.layoutCoordinates;
        return mVar != null ? mVar.g() : r.f8289b.a();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo58onPointerEventH0pRuoY(C3993p c3993p, r rVar, long j10);

    public final void setAttached$ui_release(boolean z10) {
        this.isAttached = z10;
    }

    public final void setLayoutCoordinates$ui_release(@Nullable m mVar) {
        this.layoutCoordinates = mVar;
    }
}
