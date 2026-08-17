package p380v2;

import A2.d;
import B2.c;
import C9.AbstractC0876t;
import N2.e;
import O2.f;
import P2.n;
import R1.o;
import S2.h;
import S2.s;
import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p040c3.C;
import p040c3.C2100b;
import p040c3.C2103e;
import p040c3.C2106h;
import p040c3.C2108j;
import p040c3.K;
import p398w2.b;

/* JADX INFO: renamed from: v2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4250m implements u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f56105s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f56106t = new a(new C4248k());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f56107u = new a(new C4249l());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f56110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f56111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56116j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f56118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AbstractC0876t f56119m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f56123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f56124r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f56117k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f56120n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private s.a f56122p = new h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f56121o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2.m$a */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0713a f56125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f56126b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor f56127c;

        /* JADX INFO: renamed from: v2.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC0713a {
            Constructor a();
        }

        public a(InterfaceC0713a interfaceC0713a) {
            this.f56125a = interfaceC0713a;
        }

        private Constructor b() {
            synchronized (this.f56126b) {
                if (this.f56126b.get()) {
                    return this.f56127c;
                }
                try {
                    return this.f56125a.a();
                } catch (ClassNotFoundException unused) {
                    this.f56126b.set(true);
                    return this.f56127c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public InterfaceC4253p a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (InterfaceC4253p) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C2100b());
                break;
            case 1:
                list.add(new C2103e());
                break;
            case 2:
                list.add(new C2106h((this.f56109c ? 2 : 0) | ((this.f56110d | (this.f56108b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new b((this.f56109c ? 2 : 0) | this.f56111e | (this.f56108b ? 1 : 0)));
                break;
            case 4:
                InterfaceC4253p interfaceC4253pA = f56106t.a(Integer.valueOf(this.f56112f));
                if (interfaceC4253pA == null) {
                    list.add(new d(this.f56112f));
                } else {
                    list.add(interfaceC4253pA);
                }
                break;
            case 5:
                list.add(new c());
                break;
            case 6:
                list.add(new e(this.f56122p, (this.f56121o ? 0 : 2) | this.f56113g));
                break;
            case 7:
                list.add(new f((this.f56109c ? 2 : 0) | this.f56116j | (this.f56108b ? 1 : 0)));
                break;
            case 8:
                list.add(new P2.h(this.f56122p, this.f56115i | P2.h.i(this.f56123q) | (this.f56121o ? 0 : 32)));
                list.add(new n(this.f56122p, (this.f56121o ? 0 : 16) | this.f56114h | n.s(this.f56123q)));
                break;
            case 9:
                list.add(new Q2.d());
                break;
            case 10:
                list.add(new C());
                break;
            case 11:
                if (this.f56119m == null) {
                    this.f56119m = AbstractC0876t.w();
                }
                list.add(new K(this.f56117k, !this.f56121o ? 1 : 0, this.f56122p, new U1.K(0L), new C2108j(this.f56118l, this.f56119m), this.f56120n));
                break;
            case 12:
                list.add(new p058d3.b());
                break;
            case 14:
                list.add(new D2.a(this.f56124r));
                break;
            case 15:
                InterfaceC4253p interfaceC4253pA2 = f56107u.a(new Object[0]);
                if (interfaceC4253pA2 != null) {
                    list.add(interfaceC4253pA2);
                }
                break;
            case 16:
                list.add(new p416x2.b(!this.f56121o ? 1 : 0, this.f56122p));
                break;
            case 17:
                list.add(new R2.a());
                break;
            case 18:
                list.add(new p076e3.a());
                break;
            case 19:
                list.add(new p452z2.a());
                break;
            case 20:
                int i11 = this.f56114h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new C2.a());
                    break;
                }
                break;
            case 21:
                list.add(new p434y2.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC4253p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC4253p.class).getConstructor(null);
    }

    @Override // p380v2.u
    public synchronized InterfaceC4253p[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f56105s;
            arrayList = new ArrayList(iArr.length);
            int iB = o.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = o.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4253p[]) arrayList.toArray(new InterfaceC4253p[0]);
    }

    @Override // p380v2.u
    public synchronized InterfaceC4253p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // p380v2.u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C4250m c(int i10) {
        this.f56123q = i10;
        return this;
    }

    @Override // p380v2.u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized C4250m b(boolean z10) {
        this.f56121o = z10;
        return this;
    }

    public synchronized C4250m n(int i10) {
        this.f56124r = i10;
        return this;
    }

    @Override // p380v2.u
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized C4250m a(s.a aVar) {
        this.f56122p = aVar;
        return this;
    }
}
