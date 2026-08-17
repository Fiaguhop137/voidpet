package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class B3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f44215v = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f44217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f44218c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.r f44229n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f44232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f44233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f44235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f44236u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f44216a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f44219d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f44220e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44221f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f44222g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f44223h = a.MEDIUM;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44224i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f44225j = 30000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f44226k = 5000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44227l = 3600000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44228m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44230o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private S1 f44231p = S1.PIXEL_COPY;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public B3(boolean z10, io.sentry.protocol.r rVar) {
        List list = Collections.EMPTY_LIST;
        this.f44232q = list;
        this.f44233r = list;
        this.f44234s = true;
        List list2 = f44215v;
        this.f44235t = list2;
        this.f44236u = list2;
        if (z10) {
            return;
        }
        this.f44219d.add("android.widget.TextView");
        this.f44219d.add("android.widget.ImageView");
        this.f44219d.add("android.webkit.WebView");
        this.f44219d.add("android.widget.VideoView");
        this.f44219d.add("androidx.camera.view.PreviewView");
        this.f44219d.add("androidx.media3.ui.PlayerView");
        this.f44219d.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f44219d.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f44229n = rVar;
    }

    public static List h() {
        return f44215v;
    }

    private static List y(List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public void A(boolean z10) {
        if (z10) {
            this.f44219d.add("android.widget.ImageView");
            this.f44220e.remove("android.widget.ImageView");
        } else {
            N();
            this.f44220e.add("android.widget.ImageView");
            this.f44219d.remove("android.widget.ImageView");
        }
    }

    public void B(boolean z10) {
        if (z10) {
            this.f44219d.add("android.widget.TextView");
            this.f44220e.remove("android.widget.TextView");
        } else {
            N();
            this.f44220e.add("android.widget.TextView");
            this.f44219d.remove("android.widget.TextView");
        }
    }

    public void C(String str) {
        this.f44219d.add(str);
        this.f44221f = str;
    }

    public void D(boolean z10) {
        this.f44234s = z10;
    }

    public void E(List list) {
        this.f44232q = Collections.unmodifiableList(new ArrayList(list));
    }

    public void F(List list) {
        this.f44233r = Collections.unmodifiableList(new ArrayList(list));
    }

    public void G(List list) {
        this.f44235t = y(f44215v, list);
    }

    public void H(List list) {
        this.f44236u = y(f44215v, list);
    }

    public void I(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f44218c = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void J(S1 s10) {
        this.f44231p = s10;
    }

    public void K(io.sentry.protocol.r rVar) {
        this.f44229n = rVar;
    }

    public void L(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.f44217b = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void M(String str) {
        this.f44222g = str;
    }

    public void N() {
        if (this.f44216a) {
            return;
        }
        this.f44216a = true;
        io.sentry.util.n.a("ReplayCustomMasking");
    }

    public void a(String str) {
        N();
        this.f44219d.add(str);
    }

    public long b() {
        return this.f44225j;
    }

    public int c() {
        return this.f44224i;
    }

    public Set d() {
        return this.f44219d;
    }

    public String e() {
        return this.f44221f;
    }

    public List f() {
        return this.f44232q;
    }

    public List g() {
        return this.f44233r;
    }

    public List i() {
        return this.f44235t;
    }

    public List j() {
        return this.f44236u;
    }

    public Double k() {
        return this.f44218c;
    }

    public a l() {
        return this.f44223h;
    }

    public S1 m() {
        return this.f44231p;
    }

    public io.sentry.protocol.r n() {
        return this.f44229n;
    }

    public long o() {
        return this.f44227l;
    }

    public Double p() {
        return this.f44217b;
    }

    public long q() {
        return this.f44226k;
    }

    public Set r() {
        return this.f44220e;
    }

    public String s() {
        return this.f44222g;
    }

    public boolean t() {
        return this.f44230o;
    }

    public boolean u() {
        return this.f44234s;
    }

    public boolean v() {
        return p() != null && p().doubleValue() > 0.0d;
    }

    public boolean w() {
        return k() != null && k().doubleValue() > 0.0d;
    }

    public boolean x() {
        return this.f44228m;
    }

    public void z(boolean z10) {
        this.f44230o = z10;
    }
}
