package com.google.android.play.core.integrity;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements s {
    r() {
    }

    @Override // com.google.android.play.core.integrity.s
    public final p135h8.b a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new a(i10, null);
    }
}
