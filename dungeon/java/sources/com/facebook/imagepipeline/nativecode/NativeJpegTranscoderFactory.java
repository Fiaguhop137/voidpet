package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public class NativeJpegTranscoderFactory implements p168j6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28956c;

    @V4.d
    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f28954a = i10;
        this.f28955b = z10;
        this.f28956c = z11;
    }

    @Override // p168j6.d
    @V4.d
    public p168j6.c createImageTranscoder(N5.c cVar, boolean z10) {
        if (cVar != N5.b.f7872b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f28954a, this.f28955b, this.f28956c);
    }
}
