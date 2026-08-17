package p315r9;

import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f52428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52429b;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f52428a = sideSheetBehavior;
        this.f52429b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SideSheetBehavior.F(this.f52428a, this.f52429b);
    }
}
