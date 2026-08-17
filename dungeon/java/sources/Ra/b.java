package Ra;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10916a;

    public b(boolean z10) {
        this.f10916a = z10;
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public boolean b() {
        return this.f10916a;
    }

    @Override // Ra.a
    public void disable() {
        this.f10916a = false;
    }

    @Override // Ra.a
    public void enable() {
        this.f10916a = true;
    }
}
