package com.facebook.react.devsupport;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.react.devsupport.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2203d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f29667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29668b;

    public /* synthetic */ ViewOnClickListenerC2203d(EditText editText, String str) {
        this.f29667a = editText;
        this.f29668b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2206g.g(this.f29667a, this.f29668b, view);
    }
}
