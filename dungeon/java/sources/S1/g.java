package S1;

import R1.C1342b;
import U1.AbstractC1459a;
import U1.S;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f11424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f11425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1342b f11426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f11428f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f11430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f11431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C1342b f11432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11433e;

        public b(int i10) {
            this.f11432d = C1342b.f10132h;
            this.f11429a = i10;
        }

        private b(g gVar) {
            this.f11429a = gVar.e();
            this.f11430b = gVar.f();
            this.f11431c = gVar.d();
            this.f11432d = gVar.b();
            this.f11433e = gVar.g();
        }

        /* synthetic */ b(g gVar, a aVar) {
            this(gVar);
        }

        public g a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f11430b;
            if (onAudioFocusChangeListener != null) {
                return new g(this.f11429a, onAudioFocusChangeListener, (Handler) AbstractC1459a.e(this.f11431c), this.f11432d, this.f11433e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(C1342b c1342b) {
            AbstractC1459a.e(c1342b);
            this.f11432d = c1342b;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            AbstractC1459a.e(onAudioFocusChangeListener);
            AbstractC1459a.e(handler);
            this.f11430b = onAudioFocusChangeListener;
            this.f11431c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f11433e = z10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f11434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f11435b;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f11435b = onAudioFocusChangeListener;
            this.f11434a = S.y(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            S.W0(this.f11434a, new h(this, i10));
        }
    }

    g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C1342b c1342b, boolean z10) {
        this.f11423a = i10;
        this.f11425c = handler;
        this.f11426d = c1342b;
        this.f11427e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f11424b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f11424b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f11428f = S1.a.a(i10).setAudioAttributes(c1342b.a().f10146a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f11428f = null;
        }
    }

    public b a() {
        return new b(this, null);
    }

    public C1342b b() {
        return this.f11426d;
    }

    AudioFocusRequest c() {
        return f.a(AbstractC1459a.e(this.f11428f));
    }

    public Handler d() {
        return this.f11425c;
    }

    public int e() {
        return this.f11423a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11423a == gVar.f11423a && this.f11427e == gVar.f11427e && Objects.equals(this.f11424b, gVar.f11424b) && Objects.equals(this.f11425c, gVar.f11425c) && Objects.equals(this.f11426d, gVar.f11426d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f11424b;
    }

    public boolean g() {
        return this.f11427e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11423a), this.f11424b, this.f11425c, this.f11426d, Boolean.valueOf(this.f11427e));
    }
}
