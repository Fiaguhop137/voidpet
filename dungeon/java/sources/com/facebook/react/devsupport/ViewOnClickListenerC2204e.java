package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.react.devsupport.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2204e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2206g.a f29670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f29671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f29672c;

    public /* synthetic */ ViewOnClickListenerC2204e(C2206g.a aVar, EditText editText, AlertDialog alertDialog) {
        this.f29670a = aVar;
        this.f29671b = editText;
        this.f29672c = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2206g.h(this.f29670a, this.f29671b, this.f29672c, view);
    }
}
