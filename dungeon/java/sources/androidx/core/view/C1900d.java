package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1900d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f23197a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f23198a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f23198a = new b(clipData, i10);
            } else {
                this.f23198a = new C0281d(clipData, i10);
            }
        }

        public C1900d a() {
            return this.f23198a.build();
        }

        public a b(Bundle bundle) {
            this.f23198a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f23198a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f23198a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f23199a;

        b(ClipData clipData, int i10) {
            this.f23199a = AbstractC1906g.a(clipData, i10);
        }

        @Override // androidx.core.view.C1900d.c
        public void a(Uri uri) {
            this.f23199a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1900d.c
        public void b(int i10) {
            this.f23199a.setFlags(i10);
        }

        @Override // androidx.core.view.C1900d.c
        public C1900d build() {
            return new C1900d(new e(this.f23199a.build()));
        }

        @Override // androidx.core.view.C1900d.c
        public void setExtras(Bundle bundle) {
            this.f23199a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C1900d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0281d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f23200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f23203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f23204e;

        C0281d(ClipData clipData, int i10) {
            this.f23200a = clipData;
            this.f23201b = i10;
        }

        @Override // androidx.core.view.C1900d.c
        public void a(Uri uri) {
            this.f23203d = uri;
        }

        @Override // androidx.core.view.C1900d.c
        public void b(int i10) {
            this.f23202c = i10;
        }

        @Override // androidx.core.view.C1900d.c
        public C1900d build() {
            return new C1900d(new g(this));
        }

        @Override // androidx.core.view.C1900d.c
        public void setExtras(Bundle bundle) {
            this.f23204e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f23205a;

        e(ContentInfo contentInfo) {
            this.f23205a = AbstractC1898c.a(p199l1.g.g(contentInfo));
        }

        @Override // androidx.core.view.C1900d.f
        public ContentInfo a() {
            return this.f23205a;
        }

        @Override // androidx.core.view.C1900d.f
        public ClipData b() {
            return this.f23205a.getClip();
        }

        @Override // androidx.core.view.C1900d.f
        public int c() {
            return this.f23205a.getFlags();
        }

        @Override // androidx.core.view.C1900d.f
        public int k() {
            return this.f23205a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f23205a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    private interface f {
        ContentInfo a();

        ClipData b();

        int c();

        int k();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f23206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f23209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f23210e;

        g(C0281d c0281d) {
            this.f23206a = (ClipData) p199l1.g.g(c0281d.f23200a);
            this.f23207b = p199l1.g.c(c0281d.f23201b, 0, 5, "source");
            this.f23208c = p199l1.g.f(c0281d.f23202c, 1);
            this.f23209d = c0281d.f23203d;
            this.f23210e = c0281d.f23204e;
        }

        @Override // androidx.core.view.C1900d.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.C1900d.f
        public ClipData b() {
            return this.f23206a;
        }

        @Override // androidx.core.view.C1900d.f
        public int c() {
            return this.f23208c;
        }

        @Override // androidx.core.view.C1900d.f
        public int k() {
            return this.f23207b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f23206a.getDescription());
            sb2.append(", source=");
            sb2.append(C1900d.e(this.f23207b));
            sb2.append(", flags=");
            sb2.append(C1900d.a(this.f23208c));
            if (this.f23209d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f23209d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f23210e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1900d(f fVar) {
        this.f23197a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static C1900d g(ContentInfo contentInfo) {
        return new C1900d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f23197a.b();
    }

    public int c() {
        return this.f23197a.c();
    }

    public int d() {
        return this.f23197a.k();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.f23197a.a();
        Objects.requireNonNull(contentInfoA);
        return AbstractC1898c.a(contentInfoA);
    }

    public String toString() {
        return this.f23197a.toString();
    }
}
