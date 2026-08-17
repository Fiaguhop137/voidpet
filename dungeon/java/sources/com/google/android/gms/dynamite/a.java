package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class a implements DynamiteModule.b {
    a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0397b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0397b c0397b = new DynamiteModule.b.C0397b();
        int iB = aVar.b(context, str);
        c0397b.f31982a = iB;
        c0397b.f31984c = iB != 0 ? -1 : 0;
        return c0397b;
    }
}
