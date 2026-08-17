package p168j6;

import N5.c;
import W5.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f46856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f46857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f46858e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f46854a = i10;
        this.f46855b = z10;
        this.f46856c = dVar;
        this.f46857d = num;
        this.f46858e = z11;
    }

    private final c a(c cVar, boolean z10) {
        d dVar = this.f46856c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    private final c b(c cVar, boolean z10) {
        Integer num = this.f46857d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z10);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z10);
    }

    private final c c(c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f46854a, this.f46855b, this.f46858e).createImageTranscoder(cVar, z10);
    }

    private final c d(c cVar, boolean z10) {
        c cVarCreateImageTranscoder = new h(this.f46854a).createImageTranscoder(cVar, z10);
        Intrinsics.checkNotNullExpressionValue(cVarCreateImageTranscoder, "createImageTranscoder(...)");
        return cVarCreateImageTranscoder;
    }

    @Override // p168j6.d
    public c createImageTranscoder(c imageFormat, boolean z10) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        c cVarA = a(imageFormat, z10);
        if (cVarA == null) {
            cVarA = b(imageFormat, z10);
        }
        if (cVarA == null && z.a()) {
            cVarA = c(imageFormat, z10);
        }
        return cVarA == null ? d(imageFormat, z10) : cVarA;
    }
}
