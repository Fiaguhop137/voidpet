package Pa;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.d implements Na.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0148a f8870a = new C0148a(null);

    /* JADX INFO: renamed from: Pa.a$a, reason: collision with other inner class name */
    public static final class C0148a implements Na.c {
        private C0148a() {
        }

        public /* synthetic */ C0148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Na.c
        public String a() {
            return "onDidAppear";
        }

        @Override // Na.c
        public String getEventName() {
            return "topDidAppear";
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // Na.c
    public String a() {
        return "onDidAppear";
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDidAppear";
    }
}
