package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.react.devsupport.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2205f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f29677a;

    public /* synthetic */ ViewOnClickListenerC2205f(AlertDialog alertDialog) {
        this.f29677a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2206g.i(this.f29677a, view);
    }
}
