package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f25315e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f25318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f25319i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f25311a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f25316f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f25317g = 0;

    f() {
    }

    boolean a(RecyclerView.z zVar) {
        int i10 = this.f25313c;
        return i10 >= 0 && i10 < zVar.b();
    }

    View b(RecyclerView.u uVar) {
        View viewO = uVar.o(this.f25313c);
        this.f25313c += this.f25314d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f25312b + ", mCurrentPosition=" + this.f25313c + ", mItemDirection=" + this.f25314d + ", mLayoutDirection=" + this.f25315e + ", mStartLine=" + this.f25316f + ", mEndLine=" + this.f25317g + '}';
    }
}
