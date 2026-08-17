package p139hc;

import Ad.x;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j, e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f42817a;

    public o(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f42817a = rawArray;
    }

    @Override // p139hc.i
    public JavaScriptTypedArray a() {
        return this.f42817a;
    }

    public byte c(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return x.g(e(i10));
    }

    public byte e(int i10) {
        return this.f42817a.readByte(i10);
    }

    @Override // p139hc.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return x.e(c(i10));
    }

    @Override // p139hc.j
    public int getLength() {
        return this.f42817a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    @Override // p139hc.j
    public ByteBuffer toDirectBuffer() {
        return this.f42817a.toDirectBuffer();
    }
}
