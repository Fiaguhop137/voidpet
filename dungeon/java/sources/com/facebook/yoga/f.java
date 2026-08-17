package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public class f extends e {
    public void c() {
        long j10 = this.f31436a;
        if (j10 != 0) {
            this.f31436a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
