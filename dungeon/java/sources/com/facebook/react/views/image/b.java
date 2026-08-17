package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30703h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30710g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new b(i10, i11, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int i10, int i11) {
            return new b(i10, i11, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b c(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 2, null, str, i12, i13, 0, 0, null);
        }

        public final b d(int i10, int i11) {
            return new b(i10, i11, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b e(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 5, null, str, 0, 0, i12, i13, null);
        }

        public final String f(int i10) {
            if (i10 == 1) {
                return "topError";
            }
            if (i10 == 2) {
                return "topLoad";
            }
            if (i10 == 3) {
                return "topLoadEnd";
            }
            if (i10 == 4) {
                return "topLoadStart";
            }
            if (i10 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i10).toString());
        }
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f30704a = i12;
        this.f30705b = str;
        this.f30706c = str2;
        this.f30707d = i13;
        this.f30708e = i14;
        this.f30709f = i15;
        this.f30710g = i16;
    }

    /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? 0 : i14, (i17 & 128) != 0 ? 0 : i15, (i17 & 256) != 0 ? 0 : i16);
    }

    public /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, i13, i14, i15, i16);
    }

    private final WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("uri", this.f30706c);
        writableMapCreateMap.putDouble("width", this.f30707d);
        writableMapCreateMap.putDouble("height", this.f30708e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f30704a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        int i10 = this.f30704a;
        if (i10 == 1) {
            writableMapCreateMap.putString("error", this.f30705b);
            return writableMapCreateMap;
        }
        if (i10 == 2) {
            writableMapCreateMap.putMap("source", b());
            return writableMapCreateMap;
        }
        if (i10 != 5) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("loaded", this.f30709f);
        writableMapCreateMap.putInt("total", this.f30710g);
        writableMapCreateMap.putDouble("progress", ((double) this.f30709f) / ((double) this.f30710g));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return f30703h.f(this.f30704a);
    }
}
