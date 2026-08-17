package Y0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f16664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f16665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u[] f16666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u[] f16667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f16669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f16670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f16671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16672i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f16673j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f16674k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f16675l;

        /* JADX INFO: renamed from: Y0.l$a$a, reason: collision with other inner class name */
        public static final class C0224a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f16676a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f16677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f16678c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f16679d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f16680e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f16681f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f16682g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f16683h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f16684i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f16685j;

            public C0224a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0224a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f16679d = true;
                this.f16683h = true;
                this.f16676a = iconCompat;
                this.f16677b = e.f(charSequence);
                this.f16678c = pendingIntent;
                this.f16680e = bundle;
                this.f16681f = uVarArr == null ? null : new ArrayList(Arrays.asList(uVarArr));
                this.f16679d = z10;
                this.f16682g = i10;
                this.f16683h = z11;
                this.f16684i = z12;
                this.f16685j = z13;
            }

            private void c() {
                if (this.f16684i && this.f16678c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0224a a(u uVar) {
                if (this.f16681f == null) {
                    this.f16681f = new ArrayList();
                }
                if (uVar != null) {
                    this.f16681f.add(uVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<u> arrayList3 = this.f16681f;
                if (arrayList3 != null) {
                    for (u uVar : arrayList3) {
                        if (uVar.q()) {
                            arrayList.add(uVar);
                        } else {
                            arrayList2.add(uVar);
                        }
                    }
                }
                return new a(this.f16676a, this.f16677b, this.f16678c, this.f16680e, arrayList2.isEmpty() ? null : (u[]) arrayList2.toArray(new u[arrayList2.size()]), arrayList.isEmpty() ? null : (u[]) arrayList.toArray(new u[arrayList.size()]), this.f16679d, this.f16682g, this.f16683h, this.f16684i, this.f16685j);
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, u[] uVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f16669f = true;
            this.f16665b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f16672i = iconCompat.e();
            }
            this.f16673j = e.f(charSequence);
            this.f16674k = pendingIntent;
            this.f16664a = bundle == null ? new Bundle() : bundle;
            this.f16666c = uVarArr;
            this.f16667d = uVarArr2;
            this.f16668e = z10;
            this.f16670g = i10;
            this.f16669f = z11;
            this.f16671h = z12;
            this.f16675l = z13;
        }

        public PendingIntent a() {
            return this.f16674k;
        }

        public boolean b() {
            return this.f16668e;
        }

        public Bundle c() {
            return this.f16664a;
        }

        public IconCompat d() {
            int i10;
            if (this.f16665b == null && (i10 = this.f16672i) != 0) {
                this.f16665b = IconCompat.c(null, "", i10);
            }
            return this.f16665b;
        }

        public u[] e() {
            return this.f16666c;
        }

        public int f() {
            return this.f16670g;
        }

        public boolean g() {
            return this.f16669f;
        }

        public CharSequence h() {
            return this.f16673j;
        }

        public boolean i() {
            return this.f16675l;
        }

        public boolean j() {
            return this.f16671h;
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f16686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f16687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f16688g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f16689h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f16690i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: Y0.l$b$b, reason: collision with other inner class name */
        private static class C0225b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // Y0.l.f
        public void b(k kVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.f16741b);
            IconCompat iconCompat = this.f16686e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0225b.a(bigContentTitle, this.f16686e.m(kVar instanceof m ? ((m) kVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f16686e.d());
                }
            }
            if (this.f16688g) {
                if (this.f16687f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f16687f.m(kVar instanceof m ? ((m) kVar).f() : null));
                }
            }
            if (this.f16743d) {
                bigContentTitle.setSummaryText(this.f16742c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0225b.c(bigContentTitle, this.f16690i);
                C0225b.b(bigContentTitle, this.f16689h);
            }
        }

        @Override // Y0.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f16687f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f16688g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f16686e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f16691e;

        @Override // Y0.l.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // Y0.l.f
        public void b(k kVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.f16741b).bigText(this.f16691e);
            if (this.f16743d) {
                bigTextStyleBigText.setSummaryText(this.f16742c);
            }
        }

        @Override // Y0.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f16691e = e.f(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f16692A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f16693B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f16694C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        String f16695D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        Bundle f16696E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f16697F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16698G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Notification f16699H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f16700I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f16701J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        RemoteViews f16702K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        String f16703L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f16704M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        String f16705N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f16706O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f16707P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f16708Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        boolean f16709R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Notification f16710S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f16711T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Object f16712U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public ArrayList f16713V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f16714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f16716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f16717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f16718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f16719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f16720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f16721h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f16722i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f16723j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f16724k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f16725l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f16726m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16727n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f16728o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f16729p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        f f16730q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f16731r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f16732s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f16733t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f16734u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f16735v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f16736w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f16737x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f16738y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f16739z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f16715b = new ArrayList();
            this.f16716c = new ArrayList();
            this.f16717d = new ArrayList();
            this.f16728o = true;
            this.f16692A = false;
            this.f16697F = 0;
            this.f16698G = 0;
            this.f16704M = 0;
            this.f16707P = 0;
            this.f16708Q = 0;
            Notification notification = new Notification();
            this.f16710S = notification;
            this.f16714a = context;
            this.f16703L = str;
            notification.when = System.currentTimeMillis();
            this.f16710S.audioStreamType = -1;
            this.f16727n = 0;
            this.f16713V = new ArrayList();
            this.f16709R = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void p(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f16710S;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f16710S;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(f fVar) {
            if (this.f16730q != fVar) {
                this.f16730q = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e B(CharSequence charSequence) {
            this.f16731r = f(charSequence);
            return this;
        }

        public e C(CharSequence charSequence) {
            this.f16710S.tickerText = f(charSequence);
            return this;
        }

        public e D(long[] jArr) {
            this.f16710S.vibrate = jArr;
            return this;
        }

        public e E(int i10) {
            this.f16698G = i10;
            return this;
        }

        public e F(long j10) {
            this.f16710S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f16715b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f16715b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f16696E;
                if (bundle2 == null) {
                    this.f16696E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new m(this).c();
        }

        public Bundle e() {
            if (this.f16696E == null) {
                this.f16696E = new Bundle();
            }
            return this.f16696E;
        }

        public e g(boolean z10) {
            p(16, z10);
            return this;
        }

        public e h(String str) {
            this.f16703L = str;
            return this;
        }

        public e i(int i10) {
            this.f16697F = i10;
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.f16721h = pendingIntent;
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f16719f = f(charSequence);
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f16718e = f(charSequence);
            return this;
        }

        public e m(int i10) {
            Notification notification = this.f16710S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f16710S.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bundle bundle) {
            this.f16696E = bundle;
            return this;
        }

        public e q(Bitmap bitmap) {
            this.f16724k = bitmap == null ? null : IconCompat.b(l.g(this.f16714a, bitmap));
            return this;
        }

        public e r(int i10, int i11, int i12) {
            Notification notification = this.f16710S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e s(boolean z10) {
            this.f16692A = z10;
            return this;
        }

        public e t(int i10) {
            this.f16726m = i10;
            return this;
        }

        public e u(boolean z10) {
            p(2, z10);
            return this;
        }

        public e v(int i10) {
            this.f16727n = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f16728o = z10;
            return this;
        }

        public e x(boolean z10) {
            this.f16711T = z10;
            return this;
        }

        public e y(int i10) {
            this.f16710S.icon = i10;
            return this;
        }

        public e z(Uri uri) {
            Notification notification = this.f16710S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f16710S.audioAttributes = a.a(builderD);
            return this;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f16740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f16741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f16742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f16743d = false;

        public void a(Bundle bundle) {
            if (this.f16743d) {
                bundle.putCharSequence("android.summaryText", this.f16742c);
            }
            CharSequence charSequence = this.f16741b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f16740a != eVar) {
                this.f16740a = eVar;
                if (eVar != null) {
                    eVar.A(this);
                }
            }
        }
    }

    public static boolean a(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static CharSequence b(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence c(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static Bundle d(Notification notification) {
        return notification.extras;
    }

    public static boolean e(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static CharSequence f(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static Bitmap g(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(X0.b.f15133b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(X0.b.f15132a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }
}
