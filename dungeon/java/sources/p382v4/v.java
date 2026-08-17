package p382v4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class v implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56265a;

    public static final class a implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class b implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class c implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public v(n nVar) {
        this.f56265a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(String str, int i10, int i11, h hVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f56265a.b(uriE)) {
            return null;
        }
        return this.f56265a.a(uriE, i10, i11, hVar);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
