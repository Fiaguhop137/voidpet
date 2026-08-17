package p382v4;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56170c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f56171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0714a f56172b;

    /* JADX INFO: renamed from: v4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0714a {
        d a(AssetManager assetManager, String str);
    }

    public static class b implements o, InterfaceC0714a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f56173a;

        public b(AssetManager assetManager) {
            this.f56173a = assetManager;
        }

        @Override // p382v4.a.InterfaceC0714a
        public d a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new a(this.f56173a, this);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class c implements o, InterfaceC0714a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f56174a;

        public c(AssetManager assetManager) {
            this.f56174a = assetManager;
        }

        @Override // p382v4.a.InterfaceC0714a
        public d a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new a(this.f56174a, this);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public a(AssetManager assetManager, InterfaceC0714a interfaceC0714a) {
        this.f56171a = assetManager;
        this.f56172b = interfaceC0714a;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, p274p4.h hVar) {
        return new n.a(new K4.c(uri), this.f56172b.a(this.f56171a, uri.toString().substring(f56170c)));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
