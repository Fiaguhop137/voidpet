package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
abstract class q extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected final LinkedHashSet f36637d0 = new LinkedHashSet();

    q() {
    }

    boolean V1(p pVar) {
        return this.f36637d0.add(pVar);
    }

    void W1() {
        this.f36637d0.clear();
    }
}
