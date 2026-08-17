package Z1;

import R1.C1342b;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: Z1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1688h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B9.t f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f18262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1342b f18263d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18265f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S1.g f18267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18268i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18266g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18264e = 0;

    /* JADX INFO: renamed from: Z1.h$a */
    public interface a {
        void g(float f10);

        void h(int i10);
    }

    public C1688h(Context context, Looper looper, a aVar) {
        this.f18260a = B9.u.a(new C1685g(context));
        this.f18262c = aVar;
        this.f18261b = new Handler(looper);
    }

    private void c() {
        int i10 = this.f18264e;
        if (i10 == 1 || i10 == 0 || this.f18267h == null) {
            return;
        }
        S1.m.b((AudioManager) this.f18260a.get(), this.f18267h);
    }

    private static int d(C1342b c1342b) {
        if (c1342b == null) {
            return 0;
        }
        switch (c1342b.f10141c) {
            case 0:
                AbstractC1477t.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c1342b.f10139a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                AbstractC1477t.h("AudioFocusManager", "Unidentified audio usage: " + c1342b.f10141c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i10) {
        a aVar = this.f18262c;
        if (aVar != null) {
            aVar.h(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            AbstractC1477t.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int i() {
        if (this.f18264e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        S1.g gVar = this.f18267h;
        if (gVar == null || this.f18268i) {
            this.f18267h = (gVar == null ? new S1.g.b(this.f18265f) : gVar.a()).b((C1342b) AbstractC1459a.e(this.f18263d)).d(o()).c(new C1682f(this), this.f18261b).a();
            this.f18268i = false;
        }
        return S1.m.h((AudioManager) this.f18260a.get(), this.f18267h);
    }

    private void l(int i10) {
        if (this.f18264e == i10) {
            return;
        }
        this.f18264e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f18266g == f10) {
            return;
        }
        this.f18266g = f10;
        a aVar = this.f18262c;
        if (aVar != null) {
            aVar.g(f10);
        }
    }

    private boolean m(int i10) {
        return i10 != 1 && this.f18265f == 1;
    }

    private boolean o() {
        C1342b c1342b = this.f18263d;
        return c1342b != null && c1342b.f10139a == 1;
    }

    public float f() {
        return this.f18266g;
    }

    public void h() {
        this.f18262c = null;
        c();
        l(0);
    }

    public void k(C1342b c1342b) {
        if (Objects.equals(this.f18263d, c1342b)) {
            return;
        }
        this.f18263d = c1342b;
        int iD = d(c1342b);
        this.f18265f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        AbstractC1459a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f18264e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
