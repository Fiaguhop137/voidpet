package R1;

import U1.S;
import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: R1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1342b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1342b f10132h = new e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f10133i = S.z0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f10134j = S.z0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10135k = S.z0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10136l = S.z0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f10137m = S.z0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f10138n = S.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f10145g;

    /* JADX INFO: renamed from: R1.b$b, reason: collision with other inner class name */
    private static final class C0161b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: R1.b$c */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z10) {
            builder.setIsContentSpatialized(z10);
        }

        public static void b(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: R1.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f10146a;

        private d(C1342b c1342b) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1342b.f10139a).setFlags(c1342b.f10140b).setUsage(c1342b.f10141c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                C0161b.a(usage, c1342b.f10142d);
            }
            if (i10 >= 32) {
                c.b(usage, c1342b.f10143e);
                c.a(usage, c1342b.f10144f);
            }
            this.f10146a = usage.build();
        }

        /* synthetic */ d(C1342b c1342b, a aVar) {
            this(c1342b);
        }
    }

    /* JADX INFO: renamed from: R1.b$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10147a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10148b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10149c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10150d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10151e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10152f = false;

        public C1342b a() {
            return new C1342b(this.f10147a, this.f10148b, this.f10149c, this.f10150d, this.f10151e, this.f10152f, null);
        }
    }

    private C1342b(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f10139a = i10;
        this.f10140b = i11;
        this.f10141c = i12;
        this.f10142d = i13;
        this.f10143e = i14;
        this.f10144f = z10;
    }

    /* synthetic */ C1342b(int i10, int i11, int i12, int i13, int i14, boolean z10, a aVar) {
        this(i10, i11, i12, i13, i14, z10);
    }

    public d a() {
        if (this.f10145g == null) {
            this.f10145g = new d(this, null);
        }
        return this.f10145g;
    }

    public int b() {
        if ((this.f10140b & 1) == 1) {
            return 1;
        }
        switch (this.f10141c) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1342b.class == obj.getClass()) {
            C1342b c1342b = (C1342b) obj;
            if (this.f10139a == c1342b.f10139a && this.f10140b == c1342b.f10140b && this.f10141c == c1342b.f10141c && this.f10142d == c1342b.f10142d && this.f10143e == c1342b.f10143e && this.f10144f == c1342b.f10144f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f10139a) * 31) + this.f10140b) * 31) + this.f10141c) * 31) + this.f10142d) * 31) + this.f10143e) * 31) + (this.f10144f ? 1 : 0);
    }
}
