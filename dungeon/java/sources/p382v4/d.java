package p382v4;

import K4.c;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d implements n {

    private static final class a implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f56180a;

        a(File file) {
            this.f56180a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ByteBuffer.class;
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
            try {
                aVar.f(L4.a.a(this.f56180a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new d();
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i10, int i11, p274p4.h hVar) {
        return new n.a(new c(file), new a(file));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
