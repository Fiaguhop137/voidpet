package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f31436a;

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    private e(long j10) {
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f31436a = j10;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f31436a, kVar.g());
    }

    @Override // com.facebook.yoga.c
    public void b(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f31436a, f10);
    }
}
