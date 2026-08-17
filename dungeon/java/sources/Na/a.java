package Na;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0137a f8044d = new C0137a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f8045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f8047c;

    /* JADX INFO: renamed from: Na.a$a, reason: collision with other inner class name */
    public static final class C0137a {
        private C0137a() {
        }

        public /* synthetic */ C0137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(ReactContext reactContext, int i10) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f8045a = reactContext;
        this.f8046b = i10;
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, i10);
        if (eventDispatcherC != null) {
            this.f8047c = eventDispatcherC;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i10).toString());
    }

    protected final EventDispatcher a() {
        return this.f8047c;
    }

    protected final int b() {
        return C2270o0.e(this.f8045a);
    }

    public final int c() {
        return this.f8046b;
    }
}
