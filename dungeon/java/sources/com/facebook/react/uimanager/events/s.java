package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C2264l0;
import com.facebook.react.uimanager.H;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f30438g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p199l1.f f30440i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f30441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f30443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f30444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f30445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f30446f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(String eventName, int i10, b eventState, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            s sVar = (s) s.f30440i.acquire();
            if (sVar == null) {
                sVar = new s(null);
            }
            s sVar2 = sVar;
            Object objC = p240n6.a.c(motionEvent);
            Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
            sVar2.l(eventName, i10, eventState, (MotionEvent) objC, (short) 0);
            return sVar2;
        }

        public final s b(String eventName, int i10, b eventState, MotionEvent motionEvent, short s10) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            s sVar = (s) s.f30440i.acquire();
            if (sVar == null) {
                sVar = new s(null);
            }
            s sVar2 = sVar;
            Object objC = p240n6.a.c(motionEvent);
            Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
            sVar2.l(eventName, i10, eventState, (MotionEvent) objC, s10);
            return sVar2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f30450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f30451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f30452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f30453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f30454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Set f30455i;

        public b(int i10, int i11, int i12, int i13, Map offsetByPointerId, Map hitPathByPointerId, Map eventCoordinatesByPointerId, Map screenCoordinatesByPointerId, Set hoveringPointerIds) {
            Intrinsics.checkNotNullParameter(offsetByPointerId, "offsetByPointerId");
            Intrinsics.checkNotNullParameter(hitPathByPointerId, "hitPathByPointerId");
            Intrinsics.checkNotNullParameter(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(hoveringPointerIds, "hoveringPointerIds");
            this.f30447a = i10;
            this.f30448b = i11;
            this.f30449c = i12;
            this.f30450d = i13;
            this.f30451e = offsetByPointerId;
            this.f30452f = hitPathByPointerId;
            this.f30453g = eventCoordinatesByPointerId;
            this.f30454h = screenCoordinatesByPointerId;
            this.f30455i = new HashSet(hoveringPointerIds);
        }

        public final int a() {
            return this.f30448b;
        }

        public final Map b() {
            return this.f30453g;
        }

        public final Map c() {
            return this.f30452f;
        }

        public final List d() {
            Object obj = this.f30452f.get(Integer.valueOf(this.f30448b));
            if (obj != null) {
                return (List) obj;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final Set e() {
            return this.f30455i;
        }

        public final int f() {
            return this.f30449c;
        }

        public final Map g() {
            return this.f30451e;
        }

        public final int h() {
            return this.f30447a;
        }

        public final Map i() {
            return this.f30454h;
        }

        public final int j() {
            return this.f30450d;
        }

        public final boolean k(int i10) {
            return this.f30455i.contains(Integer.valueOf(i10));
        }
    }

    static {
        String simpleName = s.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f30439h = simpleName;
        f30440i = new p199l1.f(6);
    }

    private s() {
        this.f30443c = (short) -1;
        this.f30446f = Ad.j.a(Ad.m.NONE, new q(this));
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void f(WritableMap writableMap, int i10) {
        writableMap.putBoolean("ctrlKey", (i10 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i10 & 1) != 0);
        writableMap.putBoolean("altKey", (i10 & 2) != 0);
        writableMap.putBoolean("metaKey", (i10 & 65536) != 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r1.equals("topPointerOut") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1.equals("topPointerCancel") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("topClick") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.equals("topPointerUp") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r1.equals("topPointerOver") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r1.equals("topPointerMove") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r1.equals("topPointerDown") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r1.equals("topPointerLeave") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r1.equals("topPointerEnter") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        return kotlin.collections.CollectionsKt.e(h(r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List g() {
        /*
            r4 = this;
            android.view.MotionEvent r0 = r4.f30441a
            if (r0 == 0) goto L7a
            int r0 = r0.getActionIndex()
            java.lang.String r1 = r4.f30442b
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.String r1 = "_eventName"
            kotlin.jvm.internal.Intrinsics.r(r1)
            r1 = r2
        L13:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1786514288: goto L68;
                case -1780335505: goto L5f;
                case -1304584214: goto L56;
                case -1304316135: goto L48;
                case -1304250340: goto L3f;
                case -1065042973: goto L36;
                case -992108237: goto L2d;
                case 383186882: goto L24;
                case 1343400710: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L70
        L1b:
            java.lang.String r3 = "topPointerOut"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L24:
            java.lang.String r0 = "topPointerCancel"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L2d:
            java.lang.String r3 = "topClick"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L36:
            java.lang.String r3 = "topPointerUp"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L3f:
            java.lang.String r3 = "topPointerOver"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L48:
            java.lang.String r0 = "topPointerMove"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L51:
            java.util.List r0 = r4.i()
            return r0
        L56:
            java.lang.String r3 = "topPointerDown"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L5f:
            java.lang.String r3 = "topPointerLeave"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L68:
            java.lang.String r3 = "topPointerEnter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
        L70:
            return r2
        L71:
            com.facebook.react.bridge.WritableMap r0 = r4.h(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.e(r0)
            return r0
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.s.g():java.util.List");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    private final WritableMap h(int i10) {
        boolean z10;
        String str;
        double d10;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        MotionEvent motionEvent = this.f30441a;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerId = motionEvent.getPointerId(i10);
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String strE = t.e(motionEvent.getToolType(i10));
        writableMapCreateMap.putString("pointerType", strE);
        if (m()) {
            z10 = false;
        } else {
            b bVar = this.f30445e;
            if (bVar == null) {
                Intrinsics.r("eventState");
                bVar = null;
            }
            if (!bVar.k(pointerId)) {
                b bVar2 = this.f30445e;
                if (bVar2 == null) {
                    Intrinsics.r("eventState");
                    bVar2 = null;
                }
                if (pointerId != bVar2.h()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        writableMapCreateMap.putBoolean("isPrimary", z10);
        b bVar3 = this.f30445e;
        if (bVar3 == null) {
            Intrinsics.r("eventState");
            bVar3 = null;
        }
        Object obj = bVar3.b().get(Integer.valueOf(pointerId));
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr = (float[]) obj;
        double dG = H.g(fArr[0]);
        double dG2 = H.g(fArr[1]);
        writableMapCreateMap.putDouble("clientX", dG);
        writableMapCreateMap.putDouble("clientY", dG2);
        b bVar4 = this.f30445e;
        if (bVar4 == null) {
            Intrinsics.r("eventState");
            bVar4 = null;
        }
        Object obj2 = bVar4.i().get(Integer.valueOf(pointerId));
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr2 = (float[]) obj2;
        double dG3 = H.g(fArr2[0]);
        double dG4 = H.g(fArr2[1]);
        writableMapCreateMap.putDouble("screenX", dG3);
        writableMapCreateMap.putDouble("screenY", dG4);
        writableMapCreateMap.putDouble("x", dG);
        writableMapCreateMap.putDouble("y", dG2);
        writableMapCreateMap.putDouble("pageX", dG);
        writableMapCreateMap.putDouble("pageY", dG2);
        b bVar5 = this.f30445e;
        if (bVar5 == null) {
            Intrinsics.r("eventState");
            bVar5 = null;
        }
        Object obj3 = bVar5.g().get(Integer.valueOf(pointerId));
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr3 = (float[]) obj3;
        writableMapCreateMap.putDouble("offsetX", H.g(fArr3[0]));
        writableMapCreateMap.putDouble("offsetY", H.g(fArr3[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt("detail", 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        if (Intrinsics.b(strE, "mouse") || m()) {
            writableMapCreateMap.putDouble("width", 1.0d);
            writableMapCreateMap.putDouble("height", 1.0d);
        } else {
            double dG5 = H.g(motionEvent.getTouchMajor(i10));
            writableMapCreateMap.putDouble("width", dG5);
            writableMapCreateMap.putDouble("height", dG5);
        }
        int buttonState = motionEvent.getButtonState();
        b bVar6 = this.f30445e;
        if (bVar6 == null) {
            Intrinsics.r("eventState");
            bVar6 = null;
        }
        writableMapCreateMap.putInt("button", t.a(strE, bVar6.f(), buttonState));
        String str2 = this.f30442b;
        if (str2 == null) {
            Intrinsics.r("_eventName");
            str2 = null;
        }
        writableMapCreateMap.putInt("buttons", t.b(str2, strE, buttonState));
        if (m()) {
            d10 = 0.0d;
        } else {
            int i11 = writableMapCreateMap.getInt("buttons");
            String str3 = this.f30442b;
            if (str3 == null) {
                Intrinsics.r("_eventName");
                str = null;
            } else {
                str = str3;
            }
            d10 = t.d(i11, str);
        }
        writableMapCreateMap.putDouble("pressure", d10);
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        f(writableMapCreateMap, motionEvent.getMetaState());
        return writableMapCreateMap;
    }

    private final List i() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.f30441a;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            arrayList.add(h(i10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.b j(s sVar) {
        return new r(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(s sVar, int i10, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        String str = sVar.f30442b;
        b bVar = null;
        if (str == null) {
            Intrinsics.r("_eventName");
            str = null;
        }
        if (!Intrinsics.b(eventName, str)) {
            return false;
        }
        if (!t.f(eventName)) {
            return sVar.getViewTag() == i10;
        }
        b bVar2 = sVar.f30445e;
        if (bVar2 == null) {
            Intrinsics.r("eventState");
        } else {
            bVar = bVar2;
        }
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            if (((C2264l0.b) it.next()).b() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        super.init(bVar.j(), i10, motionEvent.getEventTime());
        this.f30442b = str;
        this.f30441a = MotionEvent.obtain(motionEvent);
        this.f30443c = s10;
        this.f30445e = bVar;
    }

    private final boolean m() {
        String str = this.f30442b;
        if (str == null) {
            Intrinsics.r("_eventName");
            str = null;
        }
        return Intrinsics.b(str, "topClick");
    }

    public static final s n(String str, int i10, b bVar, MotionEvent motionEvent) {
        return f30438g.a(str, i10, bVar, motionEvent);
    }

    public static final s o(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        return f30438g.b(str, i10, bVar, motionEvent, s10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.f30441a == null) {
            ReactSoftExceptionLogger.logSoftException(f30439h, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.f30444d == null) {
            this.f30444d = g();
        }
        List<WritableMap> list = this.f30444d;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            int viewTag = getViewTag();
            String str = this.f30442b;
            if (str == null) {
                Intrinsics.r("_eventName");
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.f30441a == null) {
            ReactSoftExceptionLogger.logSoftException(f30439h, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.f30444d == null) {
            this.f30444d = g();
        }
        List<WritableMap> list = this.f30444d;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.f30442b;
            String str2 = null;
            if (str == null) {
                Intrinsics.r("_eventName");
                str = null;
            }
            short s10 = this.f30443c;
            boolean z11 = s10 != -1;
            String str3 = this.f30442b;
            if (str3 == null) {
                Intrinsics.r("_eventName");
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z11, s10, writableMap, t.c(str2));
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f30443c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public d.b getEventAnimationDriverMatchSpec() {
        return (d.b) this.f30446f.getValue();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        String str = this.f30442b;
        if (str != null) {
            return str;
        }
        Intrinsics.r("_eventName");
        return null;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f30444d = null;
        MotionEvent motionEvent = this.f30441a;
        this.f30441a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f30440i.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f30439h, e10);
        }
    }
}
