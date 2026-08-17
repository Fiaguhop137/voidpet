package Z1;

import C9.AbstractC0876t;
import U1.AbstractC1459a;
import U1.C1464f;
import U1.InterfaceC1466h;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: Z1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1711p implements H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H1 f18418a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1.p$b */
    static final class b implements H1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioManager f18419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f18420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C1464f f18421c;

        /* JADX INFO: renamed from: Z1.p$b$a */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f18421c.g(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f18421c.g(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            AbstractC1459a.e(bVar.f18421c);
            if (U1.S.I0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f18419a = audioManager;
                a aVar = bVar.new a();
                bVar.f18420b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) AbstractC1459a.e(Looper.myLooper())));
                bVar.f18421c.g(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f18419a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) AbstractC1459a.e(bVar.f18420b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) AbstractC1459a.i(this.f18419a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // Z1.H1
        public void a(H1.a aVar, Context context, Looper looper, Looper looper2, InterfaceC1466h interfaceC1466h) {
            C1464f c1464f = new C1464f(Boolean.TRUE, looper2, looper, interfaceC1466h, new r(aVar));
            this.f18421c = c1464f;
            c1464f.e(new RunnableC1716s(this, context));
        }

        @Override // Z1.H1
        public boolean b() {
            C1464f c1464f = this.f18421c;
            if (c1464f == null) {
                return true;
            }
            return ((Boolean) c1464f.d()).booleanValue();
        }

        @Override // Z1.H1
        public void disable() {
            ((C1464f) AbstractC1459a.e(this.f18421c)).e(new RunnableC1713q(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1.p$c */
    static final class c implements H1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f18423e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f18424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f18425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f18426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C1464f f18427d;

        /* JADX INFO: renamed from: Z1.p$c$a */
        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        /* JADX INFO: renamed from: Z1.p$c$b */
        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f18427d.g(Boolean.valueOf(c.j(c.this.f18424a)));
            }
        }

        static {
            C.a();
            f18423e = AbstractC1718t.a(AbstractC0876t.w(), false).build();
        }

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public static /* synthetic */ void c(c cVar) {
            H.a(AbstractC1459a.e(cVar.f18424a)).unregisterControllerCallback(I.a(AbstractC1459a.e(cVar.f18426c)));
            cVar.f18426c = null;
            cVar.f18424a.unregisterRouteCallback(K.a(AbstractC1459a.e(cVar.f18425b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            AbstractC1459a.e(cVar.f18427d);
            cVar.f18424a = MediaRouter2.getInstance(context);
            cVar.f18425b = cVar.new a();
            C1464f c1464f = cVar.f18427d;
            Objects.requireNonNull(c1464f);
            O o10 = new O(c1464f);
            cVar.f18424a.registerRouteCallback(o10, cVar.f18425b, f18423e);
            b bVar = cVar.new b();
            cVar.f18426c = bVar;
            cVar.f18424a.registerControllerCallback(o10, bVar);
            cVar.f18427d.g(Boolean.valueOf(j(cVar.f18424a)));
        }

        private static boolean i(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i10 == 1 || i10 == 2) && z10;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean j(MediaRouter2 mediaRouter2) {
            int transferReason = H.a(AbstractC1459a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(A.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // Z1.H1
        public void a(H1.a aVar, Context context, Looper looper, Looper looper2, InterfaceC1466h interfaceC1466h) {
            C1464f c1464f = new C1464f(Boolean.TRUE, looper2, looper, interfaceC1466h, new M(aVar));
            this.f18427d = c1464f;
            c1464f.e(new N(this, context));
        }

        @Override // Z1.H1
        public boolean b() {
            C1464f c1464f = this.f18427d;
            if (c1464f == null) {
                return true;
            }
            return ((Boolean) c1464f.d()).booleanValue();
        }

        @Override // Z1.H1
        public void disable() {
            ((C1464f) AbstractC1459a.i(this.f18427d)).e(new L(this));
        }
    }

    public C1711p() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f18418a = new c(null);
        } else {
            this.f18418a = new b(null);
        }
    }

    @Override // Z1.H1
    public void a(H1.a aVar, Context context, Looper looper, Looper looper2, InterfaceC1466h interfaceC1466h) {
        H1 h10 = this.f18418a;
        if (h10 != null) {
            h10.a(aVar, context, looper, looper2, interfaceC1466h);
        }
    }

    @Override // Z1.H1
    public boolean b() {
        H1 h10 = this.f18418a;
        return h10 == null || h10.b();
    }

    @Override // Z1.H1
    public void disable() {
        H1 h10 = this.f18418a;
        if (h10 != null) {
            h10.disable();
        }
    }
}
