package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.w;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f46426c;

    public static final class a {
        public boolean a(d dVar, String str, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f46426c = (b) w.c((b) interfaceC3724j1.A1(iLogger, new b.a()), "");
            return true;
        }
    }

    public enum b implements B0 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

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

    public static final class c {
        public void a(d dVar, InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
            interfaceC3729k1.d("source").j(iLogger, dVar.f46426c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f46426c = bVar;
    }
}
