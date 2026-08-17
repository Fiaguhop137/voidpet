package p139hc;

import Ad.z;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements j, e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f42806a;

    public b(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f42806a = rawArray;
    }

    @Override // p139hc.i
    public JavaScriptTypedArray a() {
        return this.f42806a;
    }

    public long c(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return z.g(e(i10 * 8));
    }

    public long e(int i10) {
        return this.f42806a.read8Byte(i10);
    }

    @Override // p139hc.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return z.e(c(i10));
    }

    @Override // p139hc.j
    public int getLength() {
        return this.f42806a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    @Override // p139hc.j
    public ByteBuffer toDirectBuffer() {
        return this.f42806a.toDirectBuffer();
    }
}
