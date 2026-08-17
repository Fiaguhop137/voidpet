package p075e2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p003a2.D1;

/* JADX INFO: loaded from: classes.dex */
public interface A {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f40223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40225c;

        public a(byte[] bArr, String str, int i10) {
            this.f40223a = bArr;
            this.f40224b = str;
            this.f40225c = i10;
        }

        public byte[] a() {
            return this.f40223a;
        }

        public String b() {
            return this.f40224b;
        }
    }

    public interface b {
        void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        A a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f40226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40227b;

        public d(byte[] bArr, String str) {
            this.f40226a = bArr;
            this.f40227b = str;
        }

        public byte[] a() {
            return this.f40226a;
        }

        public String b() {
            return this.f40227b;
        }
    }

    Map a(byte[] bArr);

    d b();

    default void c(byte[] bArr, D1 d10) {
    }

    byte[] d();

    void e(byte[] bArr, byte[] bArr2);

    void f(b bVar);

    void g(byte[] bArr);

    int h();

    Y1.b i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List list, int i10, HashMap map);

    void release();
}
