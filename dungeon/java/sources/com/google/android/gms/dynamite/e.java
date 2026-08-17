package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0397b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0397b c0397b = new DynamiteModule.b.C0397b();
        int iA = aVar.a(context, str, true);
        c0397b.f31983b = iA;
        if (iA != 0) {
            c0397b.f31984c = 1;
            return c0397b;
        }
        int iB = aVar.b(context, str);
        c0397b.f31982a = iB;
        if (iB != 0) {
            c0397b.f31984c = -1;
        }
        return c0397b;
    }
}
