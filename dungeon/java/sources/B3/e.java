package B3;

import If.C1106h;
import If.a0;
import If.b0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f568b;

        a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f567a = byteBufferSlice;
            this.f568b = byteBufferSlice.capacity();
        }

        @Override // If.a0
        public b0 C() {
            return b0.f5484e;
        }

        @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // If.a0
        public long o0(C1106h c1106h, long j10) {
            if (this.f567a.position() == this.f568b) {
                return -1L;
            }
            this.f567a.limit(kotlin.ranges.e.i((int) (((long) this.f567a.position()) + j10), this.f568b));
            return c1106h.write(this.f567a);
        }
    }

    public static final a0 a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
