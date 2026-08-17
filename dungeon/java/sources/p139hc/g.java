package p139hc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j, e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f42810a;

    public g(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f42810a = rawArray;
    }

    @Override // p139hc.i
    public JavaScriptTypedArray a() {
        return this.f42810a;
    }

    @Override // p139hc.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Integer.valueOf(e(i10 * 4));
    }

    public int e(int i10) {
        return this.f42810a.read4Byte(i10);
    }

    @Override // p139hc.j
    public int getLength() {
        return this.f42810a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    @Override // p139hc.j
    public ByteBuffer toDirectBuffer() {
        return this.f42810a.toDirectBuffer();
    }
}
