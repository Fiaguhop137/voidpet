package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f37057a;

    public /* synthetic */ j(p pVar) {
        this.f37057a = pVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return p.z(this.f37057a, view, motionEvent);
    }
}
