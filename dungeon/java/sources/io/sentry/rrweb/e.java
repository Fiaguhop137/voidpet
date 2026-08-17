package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f46427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f46429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f46430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f46432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f46434k;

    public static final class a implements InterfaceC3773r0 {
        private void c(e eVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            d.a aVar = new d.a();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "x":
                        eVar.f46429f = interfaceC3724j1.nextFloat();
                        break;
                    case "y":
                        eVar.f46430g = interfaceC3724j1.nextFloat();
                        break;
                    case "id":
                        eVar.f46428e = interfaceC3724j1.nextInt();
                        break;
                    case "type":
                        eVar.f46427d = (b) interfaceC3724j1.A1(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f46431h = interfaceC3724j1.nextInt();
                        break;
                    case "pointerId":
                        eVar.f46432i = interfaceC3724j1.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strX0, interfaceC3724j1, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC3724j1.M2(iLogger, map, strX0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            eVar.p(map);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            e eVar = new e();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(eVar, interfaceC3724j1, iLogger);
                } else if (!aVar.a(eVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            eVar.t(map);
            interfaceC3724j1.T();
            return eVar;
        }
    }

    public enum b implements B0 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements InterfaceC3773r0 {
            @Override // io.sentry.InterfaceC3773r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
                return b.values()[interfaceC3724j1.nextInt()];
            }
        }

        @Override // io.sentry.B0
        public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
            interfaceC3729k1.a(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f46431h = 2;
    }

    private void o(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new d.c().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("type").j(iLogger, this.f46427d);
        interfaceC3729k1.d("id").a(this.f46428e);
        interfaceC3729k1.d("x").b(this.f46429f);
        interfaceC3729k1.d("y").b(this.f46430g);
        interfaceC3729k1.d("pointerType").a(this.f46431h);
        interfaceC3729k1.d("pointerId").a(this.f46432i);
        Map map = this.f46434k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46434k.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void p(Map map) {
        this.f46434k = map;
    }

    public void q(int i10) {
        this.f46428e = i10;
    }

    public void r(b bVar) {
        this.f46427d = bVar;
    }

    public void s(int i10) {
        this.f46432i = i10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new io.sentry.rrweb.b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        o(interfaceC3729k1, iLogger);
        Map map = this.f46433j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46433j.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void t(Map map) {
        this.f46433j = map;
    }

    public void u(float f10) {
        this.f46429f = f10;
    }

    public void v(float f10) {
        this.f46430g = f10;
    }
}
