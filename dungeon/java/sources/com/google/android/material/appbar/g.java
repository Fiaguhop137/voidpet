package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes2.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f36150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36155f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36156g = true;

    public g(View view) {
        this.f36150a = view;
    }

    void a() {
        View view = this.f36150a;
        Z.X(view, this.f36153d - (view.getTop() - this.f36151b));
        View view2 = this.f36150a;
        Z.W(view2, this.f36154e - (view2.getLeft() - this.f36152c));
    }

    public int b() {
        return this.f36153d;
    }

    void c() {
        this.f36151b = this.f36150a.getTop();
        this.f36152c = this.f36150a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f36156g || this.f36154e == i10) {
            return false;
        }
        this.f36154e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f36155f || this.f36153d == i10) {
            return false;
        }
        this.f36153d = i10;
        a();
        return true;
    }
}
