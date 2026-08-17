package p436y4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p274p4.f;
import p328s4.d;

/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f57892b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f50778a);

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f57892b);
    }

    @Override // p436y4.g
    protected Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return B.b(dVar, bitmap, i10, i11);
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // p274p4.f
    public int hashCode() {
        return -670243078;
    }
}
