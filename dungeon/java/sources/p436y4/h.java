package p436y4;

import java.nio.ByteBuffer;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f57890a;

    public h(p pVar) {
        this.f57890a = pVar;
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ByteBuffer byteBuffer, int i10, int i11, p274p4.h hVar) {
        return this.f57890a.f(byteBuffer, i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, p274p4.h hVar) {
        return this.f57890a.q(byteBuffer);
    }
}
