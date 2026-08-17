package p253o1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f50314a;

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f50315a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f50315a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f50315a = (InputContentInfo) obj;
        }

        @Override // o1.f.c
        public Object a() {
            return this.f50315a;
        }

        @Override // o1.f.c
        public Uri b() {
            return this.f50315a.getContentUri();
        }

        @Override // o1.f.c
        public void c() {
            this.f50315a.requestPermission();
        }

        @Override // o1.f.c
        public Uri d() {
            return this.f50315a.getLinkUri();
        }

        @Override // o1.f.c
        public ClipDescription g() {
            return this.f50315a.getDescription();
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f50316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f50317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f50318c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f50316a = uri;
            this.f50317b = clipDescription;
            this.f50318c = uri2;
        }

        @Override // o1.f.c
        public Object a() {
            return null;
        }

        @Override // o1.f.c
        public Uri b() {
            return this.f50316a;
        }

        @Override // o1.f.c
        public void c() {
        }

        @Override // o1.f.c
        public Uri d() {
            return this.f50318c;
        }

        @Override // o1.f.c
        public ClipDescription g() {
            return this.f50317b;
        }
    }

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription g();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f50314a = new a(uri, clipDescription, uri2);
        } else {
            this.f50314a = new b(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f50314a = cVar;
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f50314a.b();
    }

    public ClipDescription b() {
        return this.f50314a.g();
    }

    public Uri c() {
        return this.f50314a.d();
    }

    public void d() {
        this.f50314a.c();
    }

    public Object e() {
        return this.f50314a.a();
    }
}
