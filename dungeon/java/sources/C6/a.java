package C6;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1472a = new a();

    /* JADX INFO: renamed from: C6.a$a, reason: collision with other inner class name */
    private static final class C0032a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f1473a;

        public C0032a() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
            this.f1473a = choreographer;
        }

        @Override // C6.b.a
        public void a(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f1473a.postFrameCallback(callback);
        }

        @Override // C6.b.a
        public void b(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f1473a.removeFrameCallback(callback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f1472a;
    }

    @Override // C6.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0032a();
    }
}
