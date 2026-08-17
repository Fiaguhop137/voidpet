package p064d9;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f39877a;

    public /* synthetic */ a(CarouselLayoutManager carouselLayoutManager) {
        this.f39877a = carouselLayoutManager;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CarouselLayoutManager.R1(this.f39877a, view, i10, i11, i12, i13, i14, i15, i16, i17);
    }
}
