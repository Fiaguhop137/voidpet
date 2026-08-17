package S1;

import U1.S;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f11448a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f11449e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11453d;

        public a(int i10, int i11, int i12) {
            this.f11450a = i10;
            this.f11451b = i11;
            this.f11452c = i12;
            this.f11453d = S.D0(i12) ? S.l0(i12, i11) : -1;
        }

        public a(R1.r rVar) {
            this(rVar.f10253H, rVar.f10252G, rVar.f10254I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11450a == aVar.f11450a && this.f11451b == aVar.f11451b && this.f11452c == aVar.f11452c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11450a), Integer.valueOf(this.f11451b), Integer.valueOf(this.f11452c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f11450a + ", channelCount=" + this.f11451b + ", encoding=" + this.f11452c + ']';
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f11454a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.f11454a = aVar;
        }
    }

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    a e(a aVar);

    void f();

    void flush();

    void reset();
}
