package p139hc;

import Ad.B;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j, e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f42814a;

    public l(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f42814a = rawArray;
    }

    @Override // p139hc.i
    public JavaScriptTypedArray a() {
        return this.f42814a;
    }

    public short c(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return B.g(e(i10 * 2));
    }

    public short e(int i10) {
        return this.f42814a.read2Byte(i10);
    }

    @Override // p139hc.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return B.e(c(i10));
    }

    @Override // p139hc.j
    public int getLength() {
        return this.f42814a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    @Override // p139hc.j
    public ByteBuffer toDirectBuffer() {
        return this.f42814a.toDirectBuffer();
    }
}
