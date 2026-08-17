package p382v4;

import com.bumptech.glide.h;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0716b f56175a;

    public static class a implements o {

        /* JADX INFO: renamed from: v4.b$a$a, reason: collision with other inner class name */
        class C0715a implements InterfaceC0716b {
            C0715a() {
            }

            @Override // p382v4.b.InterfaceC0716b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // p382v4.b.InterfaceC0716b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new b(new C0715a());
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    /* JADX INFO: renamed from: v4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0716b {
        Class a();

        Object b(byte[] bArr);
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f56177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0716b f56178b;

        c(byte[] bArr, InterfaceC0716b interfaceC0716b) {
            this.f56177a = bArr;
            this.f56178b = interfaceC0716b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56178b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, com.bumptech.glide.load.data.d.a aVar) {
            aVar.f(this.f56178b.b(this.f56177a));
        }
    }

    public static class d implements o {

        class a implements InterfaceC0716b {
            a() {
            }

            @Override // p382v4.b.InterfaceC0716b
            public Class a() {
                return InputStream.class;
            }

            @Override // p382v4.b.InterfaceC0716b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new b(new a());
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public b(InterfaceC0716b interfaceC0716b) {
        this.f56175a = interfaceC0716b;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(byte[] bArr, int i10, int i11, p274p4.h hVar) {
        return new n.a(new K4.c(bArr), new c(bArr, this.f56175a));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
