package p054d;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3216b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39410e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39414d;

    /* JADX INFO: renamed from: d.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3216b(float f10, float f11, float f12, int i10) {
        this.f39411a = f10;
        this.f39412b = f11;
        this.f39413c = f12;
        this.f39414d = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3216b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C3215a c3215a = C3215a.f39409a;
        this(c3215a.d(backEvent), c3215a.e(backEvent), c3215a.b(backEvent), c3215a.c(backEvent));
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f39411a + ", touchY=" + this.f39412b + ", progress=" + this.f39413c + ", swipeEdge=" + this.f39414d + '}';
    }
}
