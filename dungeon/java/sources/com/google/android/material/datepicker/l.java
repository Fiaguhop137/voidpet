package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class l<S> extends q {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f36614e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f36615f0;

    class a extends p {
        a() {
        }
    }

    static l X1(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.M1(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.i
    public void D0(Bundle bundle) {
        super.D0(bundle);
        if (bundle == null) {
            bundle = E();
        }
        this.f36614e0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f36615f0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.i
    public View H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(G(), this.f36614e0));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.i
    public void Z0(Bundle bundle) {
        super.Z0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f36614e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36615f0);
    }
}
