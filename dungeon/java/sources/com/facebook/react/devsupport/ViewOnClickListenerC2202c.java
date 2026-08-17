package com.facebook.react.devsupport;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.react.devsupport.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2202c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f29664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29665b;

    public /* synthetic */ ViewOnClickListenerC2202c(EditText editText, String str) {
        this.f29664a = editText;
        this.f29665b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2206g.f(this.f29664a, this.f29665b, view);
    }
}
