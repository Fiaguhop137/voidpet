package p436y4;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4361e f57891a = new C4361e();

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        return this.f57891a.c(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h hVar) {
        return true;
    }
}
