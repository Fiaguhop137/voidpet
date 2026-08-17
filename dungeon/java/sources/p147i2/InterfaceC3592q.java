package p147i2;

import R1.r;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: i2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3592q {

    /* JADX INFO: renamed from: i2.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f43714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f43715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f43716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f43717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f43718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C3590o f43719f;

        private a(t tVar, MediaFormat mediaFormat, r rVar, Surface surface, MediaCrypto mediaCrypto, C3590o c3590o) {
            this.f43714a = tVar;
            this.f43715b = mediaFormat;
            this.f43716c = rVar;
            this.f43717d = surface;
            this.f43718e = mediaCrypto;
            this.f43719f = c3590o;
        }

        public static a a(t tVar, MediaFormat mediaFormat, r rVar, MediaCrypto mediaCrypto, C3590o c3590o) {
            return new a(tVar, mediaFormat, rVar, null, mediaCrypto, c3590o);
        }

        public static a b(t tVar, MediaFormat mediaFormat, r rVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, rVar, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: renamed from: i2.q$b */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43720a = new C3585j();

        static b a(Context context) {
            return new C3585j(context);
        }

        InterfaceC3592q b(a aVar);
    }

    /* JADX INFO: renamed from: i2.q$c */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: i2.q$d */
    public interface d {
        void a(InterfaceC3592q interfaceC3592q, long j10, long j11);
    }

    void a(int i10, int i11, Y1.c cVar, long j10, int i12);

    void b(int i10, int i11, int i12, long j10, int i13);

    void c(Bundle bundle);

    default boolean d(c cVar) {
        return false;
    }

    MediaFormat e();

    void f();

    void flush();

    void g(int i10);

    ByteBuffer h(int i10);

    void i(Surface surface);

    boolean j();

    void k(int i10, long j10);

    int l();

    int m(MediaCodec.BufferInfo bufferInfo);

    void n(int i10, boolean z10);

    ByteBuffer o(int i10);

    void p(d dVar, Handler handler);

    void release();
}
