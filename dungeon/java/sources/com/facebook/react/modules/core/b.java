package com.facebook.react.modules.core;

import M6.h;
import M6.i;
import M6.j;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0380b f29885f = new C0380b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f29886g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6.b.a f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f29888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Choreographer.FrameCallback f29891e;

    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f29898h = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29899a;

        a(int i10) {
            this.f29899a = i10;
        }

        public static EnumEntries g() {
            return f29898h;
        }

        public final int h() {
            return this.f29899a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.core.b$b, reason: collision with other inner class name */
    public static final class C0380b {
        private C0380b() {
        }

        public /* synthetic */ C0380b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = b.f29886g;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(C6.b choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (b.f29886g == null) {
                b.f29886g = new b(choreographerProvider, null);
            }
        }
    }

    private b(C6.b bVar) {
        int size = a.g().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque();
        }
        this.f29888b = arrayDequeArr;
        this.f29891e = new h(this);
        UiThreadUtil.runOnUiThread(new i(this, bVar));
    }

    public /* synthetic */ b(C6.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, C6.b bVar2) {
        bVar.f29887a = bVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j10) {
        synchronized (bVar.f29888b) {
            try {
                bVar.f29890d = false;
                int length = bVar.f29888b.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayDeque arrayDeque = bVar.f29888b[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j10);
                            bVar.f29889c--;
                        } else {
                            W4.a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final b h() {
        return f29885f.a();
    }

    public static final void i(C6.b bVar) {
        f29885f.b(bVar);
    }

    private final void j() {
        p240n6.a.a(this.f29889c >= 0);
        if (this.f29889c == 0 && this.f29890d) {
            C6.b.a aVar = this.f29887a;
            if (aVar != null) {
                aVar.b(this.f29891e);
            }
            this.f29890d = false;
        }
    }

    private final void l() {
        if (this.f29890d) {
            return;
        }
        C6.b.a aVar = this.f29887a;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new j(this));
        } else {
            aVar.a(this.f29891e);
            this.f29890d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.f29888b) {
            bVar.l();
            Unit unit = Unit.f48228a;
        }
    }

    public final void k(a type, Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f29888b) {
            this.f29888b[type.h()].addLast(callback);
            boolean z10 = true;
            int i10 = this.f29889c + 1;
            this.f29889c = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            p240n6.a.a(z10);
            l();
            Unit unit = Unit.f48228a;
        }
    }

    public final void n(a type, Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.f29888b) {
            try {
                if (this.f29888b[type.h()].removeFirstOccurrence(frameCallback)) {
                    this.f29889c--;
                    j();
                } else {
                    W4.a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
