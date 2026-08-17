package p382v4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f56256b;

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56257a;

        public a(Resources resources) {
            this.f56257a = resources;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new s(this.f56257a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56258a;

        public b(Resources resources) {
            this.f56258a = resources;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new s(this.f56258a, rVar.d(Uri.class, InputStream.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56259a;

        public c(Resources resources) {
            this.f56259a = resources;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new s(this.f56259a, w.c());
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public s(Resources resources, n nVar) {
        this.f56256b = resources;
        this.f56255a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f56256b.getResourcePackageName(num.intValue()) + '/' + this.f56256b.getResourceTypeName(num.intValue()) + '/' + this.f56256b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i10, int i11, h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f56255a.a(uriD, i10, i11, hVar);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
