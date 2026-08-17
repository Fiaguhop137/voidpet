package p315r9;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p217m1.E;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f52426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52427b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f52426a = sideSheetBehavior;
        this.f52427b = i10;
    }

    @Override // p217m1.E
    public final boolean a(View view, E.a aVar) {
        return SideSheetBehavior.E(this.f52426a, this.f52427b, view, aVar);
    }
}
