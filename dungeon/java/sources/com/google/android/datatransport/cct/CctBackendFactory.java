package com.google.android.datatransport.cct;

import O7.h;
import O7.m;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CctBackendFactory implements O7.d {
    @Override // O7.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
