package p382v4;

import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f56181a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    private static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f56183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f56184c;

        b(String str, a aVar) {
            this.f56182a = str;
            this.f56183b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56183b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f56183b.b(this.f56184c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, d.a aVar) {
            try {
                Object objC = this.f56183b.c(this.f56182a);
                this.f56184c = objC;
                aVar.f(objC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f56185a = new a();

        class a implements a {
            a() {
            }

            @Override // v4.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // v4.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // v4.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new e(this.f56185a);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public e(a aVar) {
        this.f56181a = aVar;
    }

    @Override // p382v4.n
    public n.a a(Object obj, int i10, int i11, p274p4.h hVar) {
        return new n.a(new K4.c(obj), new b(obj.toString(), this.f56181a));
    }

    @Override // p382v4.n
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
