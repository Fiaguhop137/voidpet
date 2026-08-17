package La;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6568e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f6572d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f6569a = f10;
        this.f6570b = z10;
        this.f6571c = z11;
        this.f6572d = s10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f6572d;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.f6569a);
        writableMapCreateMap.putInt("closing", this.f6570b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f6571c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topTransitionProgress";
    }
}
