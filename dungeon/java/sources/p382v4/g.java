package p382v4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f56197a;

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f56198a;

        public a(d dVar) {
            this.f56198a = dVar;
        }

        @Override // p382v4.o
        public final n d(r rVar) {
            return new g(this.f56198a);
        }

        @Override // p382v4.o
        public final void e() {
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // v4.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // v4.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // v4.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f56199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f56200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f56201c;

        c(File file, d dVar) {
            this.f56199a = file;
            this.f56200b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56200b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f56201c;
            if (obj != null) {
                try {
                    this.f56200b.b(obj);
                } catch (IOException unused) {
                }
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
        public void e(h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                Object objC = this.f56200b.c(this.f56199a);
                this.f56201c = objC;
                aVar.f(objC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // v4.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // v4.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // v4.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f56197a = dVar;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i10, int i11, p274p4.h hVar) {
        return new n.a(new K4.c(file), new c(file, this.f56197a));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
