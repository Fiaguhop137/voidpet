package Z5;

import kotlin.jvm.internal.Intrinsics;
import p025b6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f18782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, k encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f18782a = encodedImage;
    }

    public final k a() {
        return this.f18782a;
    }
}
