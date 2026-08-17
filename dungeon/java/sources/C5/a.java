package C5;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z4.a f1428b;

    public a(int i10, Z4.a bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f1427a = i10;
        this.f1428b = bitmap;
    }

    public final Z4.a a() {
        return this.f1428b;
    }

    public final int b() {
        return this.f1427a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1428b.close();
    }
}
