package Y4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b implements p199l1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16936a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16937b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f16938c = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f16937b);
        }
    }

    public static int d() {
        return f16937b;
    }

    @Override // p199l1.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return (ByteBuffer) f16938c.get();
    }

    @Override // p199l1.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
