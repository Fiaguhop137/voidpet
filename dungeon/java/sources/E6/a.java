package E6;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0057a f2722c = new C0057a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f2724b;

    /* JADX INFO: renamed from: E6.a$a, reason: collision with other inner class name */
    private static final class C0057a {
        private C0057a() {
        }

        public /* synthetic */ C0057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b.b("InteropEvent", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String interopEventName, WritableMap writableMap, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(interopEventName, "interopEventName");
        this.f2723a = interopEventName;
        this.f2724b = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f2724b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f2723a;
    }
}
