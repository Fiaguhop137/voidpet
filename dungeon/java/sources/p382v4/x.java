package p382v4;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f56269b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f56270a;

    public static final class a implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56271a;

        public a(ContentResolver contentResolver) {
            this.f56271a = contentResolver;
        }

        @Override // v4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f56271a, uri);
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public static class b implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56272a;

        public b(ContentResolver contentResolver) {
            this.f56272a = contentResolver;
        }

        @Override // v4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new i(this.f56272a, uri);
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56273a;

        public d(ContentResolver contentResolver) {
            this.f56273a = contentResolver;
        }

        @Override // v4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new n(this.f56273a, uri);
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public x(c cVar) {
        this.f56270a = cVar;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new K4.c(uri), this.f56270a.a(uri));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f56269b.contains(uri.getScheme());
    }
}
