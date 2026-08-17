package Pa;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.d implements Na.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8871a = new a(null);

    public static final class a implements Na.c {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Na.c
        public String a() {
            return "onDidDisappear";
        }

        @Override // Na.c
        public String getEventName() {
            return "topDidDisappear";
        }
    }

    public b(int i10, int i11) {
        super(i10, i11);
    }

    @Override // Na.c
    public String a() {
        return "onDidDisappear";
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
        return "topDidDisappear";
    }
}
