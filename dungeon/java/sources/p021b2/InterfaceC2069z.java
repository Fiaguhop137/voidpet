package p021b2;

import R1.B;
import R1.C1342b;
import R1.C1346f;
import R1.r;
import U1.InterfaceC1466h;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p003a2.D1;

/* JADX INFO: renamed from: b2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2069z {

    /* JADX INFO: renamed from: b2.z$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f26201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26203f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f26198a = i10;
            this.f26199b = i11;
            this.f26200c = i12;
            this.f26201d = z10;
            this.f26202e = z11;
            this.f26203f = i13;
        }
    }

    /* JADX INFO: renamed from: b2.z$b */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f26204a;

        public b(String str, r rVar) {
            super(str);
            this.f26204a = rVar;
        }

        public b(Throwable th, r rVar) {
            super(th);
            this.f26204a = rVar;
        }
    }

    /* JADX INFO: renamed from: b2.z$c */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f26207c;

        public c(int i10, int i11, int i12, int i13, int i14, r rVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(rVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, rVar, z10, exc);
        }

        public c(String str, int i10, r rVar, boolean z10, Throwable th) {
            super(str, th);
            this.f26205a = i10;
            this.f26206b = z10;
            this.f26207c = rVar;
        }
    }

    /* JADX INFO: renamed from: b2.z$d */
    public interface d {
        void a(long j10);

        void b(a aVar);

        void c(int i10);

        void d(boolean z10);

        void e(Exception exc);

        void f(a aVar);

        void g();

        void h();

        void i(int i10, long j10, long j11);

        void j();

        void k();

        void l();
    }

    /* JADX INFO: renamed from: b2.z$e */
    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26209b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f26208a = j10;
            this.f26209b = j11;
        }
    }

    /* JADX INFO: renamed from: b2.z$f */
    public static final class f extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f26212c;

        public f(int i10, r rVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f26211b = z10;
            this.f26210a = i10;
            this.f26212c = rVar;
        }
    }

    void A(boolean z10);

    boolean a(r rVar);

    boolean b();

    B c();

    void d(B b10);

    boolean e();

    void f(float f10);

    void flush();

    void g();

    void h(int i10);

    long i();

    void j(int i10);

    void k();

    void l(d dVar);

    boolean m(ByteBuffer byteBuffer, long j10, int i10);

    void n(InterfaceC1466h interfaceC1466h);

    int o(r rVar);

    void p();

    void pause();

    void q(D1 d10);

    void r(C1346f c1346f);

    void release();

    void reset();

    void s(int i10, int i11);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    long t(boolean z10);

    default void u(long j10) {
    }

    void v();

    void w();

    void x(r rVar, int i10, int[] iArr);

    C2055k y(r rVar);

    void z(C1342b c1342b);
}
