package p382v4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public final class t implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f56261b;

    private static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56262a;

        a(Context context) {
            this.f56262a = context;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new t(this.f56262a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    private static final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56263a;

        b(Context context) {
            this.f56263a = context;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new t(this.f56263a, rVar.d(Integer.class, InputStream.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    t(Context context, n nVar) {
        this.f56260a = context.getApplicationContext();
        this.f56261b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, h hVar) {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f56261b.a(Integer.valueOf(i12), i10, i11, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f56260a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f56260a.getPackageName());
        if (identifier != 0) {
            return this.f56261b.a(Integer.valueOf(identifier), i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f56260a.getPackageName().equals(uri.getAuthority());
    }
}
