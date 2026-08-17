package io.invertase.firebase.common;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44183a = new a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44185c;

    public b(Context context, String str) {
        this.f44184b = context;
        this.f44185c = str;
    }

    public Context a() {
        return this.f44184b;
    }

    public String b() {
        return "Universal" + this.f44185c + "Module";
    }
}
