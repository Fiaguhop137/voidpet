package p436y4;

import L4.a;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import p274p4.h;
import p274p4.j;

/* JADX INFO: loaded from: classes.dex */
public final class v implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4361e f57944a = new C4361e();

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p310r4.v b(InputStream inputStream, int i10, int i11, h hVar) {
        return this.f57944a.c(ImageDecoder.createSource(a.b(inputStream)), i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h hVar) {
        return true;
    }
}
