package p079e6;

import V4.p;
import Y4.i;
import Y4.l;
import com.facebook.imagepipeline.memory.f;
import com.facebook.imagepipeline.memory.g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f40527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f40528b;

    public y(f pool, l pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f40527a = pool;
        this.f40528b = pooledByteStreams;
    }

    public final x f(InputStream inputStream, g outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f40528b.a(inputStream, outputStream);
        return outputStream.a();
    }

    @Override // Y4.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a(InputStream inputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        g gVar = new g(this.f40527a, 0, 2, null);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // Y4.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x b(InputStream inputStream, int i10) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        g gVar = new g(this.f40527a, i10);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // Y4.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x d(byte[] bytes) throws Throwable {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        g gVar = new g(this.f40527a, bytes.length);
        try {
            try {
                gVar.write(bytes, 0, bytes.length);
                x xVarA = gVar.a();
                gVar.close();
                return xVarA;
            } catch (IOException e10) {
                throw p.a(e10);
            }
        } catch (Throwable th) {
            gVar.close();
            throw th;
        }
    }

    @Override // Y4.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g c() {
        return new g(this.f40527a, 0, 2, null);
    }

    @Override // Y4.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public g e(int i10) {
        return new g(this.f40527a, i10);
    }
}
