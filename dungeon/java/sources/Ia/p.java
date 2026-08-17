package Ia;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC1098d {

    public static final class a extends AbstractC1098d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5242b = p.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5243c = "ManualGestureHandler";

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5243c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5242b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p a(Context context) {
            return new p();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.e c(p handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.e(handler);
        }
    }

    @Override // Ia.AbstractC1098d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (S() == 0) {
            p();
        }
    }
}
