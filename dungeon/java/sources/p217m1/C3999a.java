package p217m1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3999a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f48990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48991c;

    public C3999a(int i10, B b10, int i11) {
        this.f48989a = i10;
        this.f48990b = b10;
        this.f48991c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f48989a);
        this.f48990b.n0(this.f48991c, bundle);
    }
}
