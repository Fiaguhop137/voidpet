package Pa;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends com.facebook.react.uimanager.events.d implements Na.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8874b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8875a;

    public static final class a implements Na.c {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Na.c
        public String a() {
            return "onNativeFocusChange";
        }

        @Override // Na.c
        public String getEventName() {
            return "topNativeFocusChange";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, String tabKey) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(tabKey, "tabKey");
        this.f8875a = tabKey;
    }

    @Override // Na.c
    public String a() {
        return "onNativeFocusChange";
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f8875a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topNativeFocusChange";
    }
}
