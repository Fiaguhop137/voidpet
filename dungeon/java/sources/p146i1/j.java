package p146i1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p020b1.u;
import p199l1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f43544b;

        a(int i10, List list) {
            this.f43543a = i10;
            this.f43544b = list;
        }

        public a(int i10, b[] bVarArr) {
            this.f43543a = i10;
            this.f43544b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f43544b.get(0);
        }

        public List d() {
            return this.f43544b;
        }

        public int e() {
            return this.f43543a;
        }

        boolean f() {
            return this.f43544b.size() > 1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f43545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f43546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f43547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f43548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f43549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f43550f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f43545a = (Uri) g.g(uri);
            this.f43546b = i10;
            this.f43547c = i11;
            this.f43548d = z10;
            this.f43549e = str;
            this.f43550f = i12;
        }

        public b(String str, String str2) {
            this.f43545a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f43546b = 0;
            this.f43547c = 400;
            this.f43548d = false;
            this.f43549e = str2;
            this.f43550f = 0;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f43550f;
        }

        public String c() {
            if (i()) {
                return this.f43545a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f43546b;
        }

        public Uri e() {
            return this.f43545a;
        }

        public String f() {
            return this.f43549e;
        }

        public int g() {
            return this.f43547c;
        }

        public boolean h() {
            return this.f43548d;
        }

        public boolean i() {
            return Objects.equals(this.f43545a.getScheme(), "systemfont");
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return u.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, f fVar) {
        return e.e(context, h.a(new Object[]{fVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        p146i1.a aVar = new p146i1.a(cVar, k.b(handler));
        if (!z10) {
            return i.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (f) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }
}
