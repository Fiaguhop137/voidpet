package p409wd;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p427xd.a;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static g f56837g = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ReactContext f56841d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56843f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56838a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f56839b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f56840c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f56842e = Boolean.FALSE;

    private boolean g(a aVar) {
        ReactContext reactContext;
        if (this.f56842e.booleanValue() && (reactContext = this.f56841d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f56841d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.getEventName(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.getEventName(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f56837g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ReactContext reactContext) {
        this.f56841d = reactContext;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        this.f56842e = bool;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(a aVar) {
        synchronized (this.f56840c) {
            try {
                if (!this.f56840c.containsKey(aVar.getEventName()) || !g(aVar)) {
                    this.f56838a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        synchronized (this.f56840c) {
            try {
                for (a aVar : new ArrayList(this.f56838a)) {
                    if (this.f56840c.containsKey(aVar.getEventName())) {
                        this.f56838a.remove(aVar);
                        o(aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f56840c) {
            try {
                this.f56843f++;
                if (this.f56840c.containsKey(str)) {
                    this.f56840c.put(str, Integer.valueOf(((Integer) this.f56840c.get(str)).intValue() + 1));
                } else {
                    this.f56840c.put(str, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f56839b.post(new e(this));
    }

    public void f(ReactContext reactContext) {
        this.f56839b.post(new d(this, reactContext));
    }

    public WritableMap h() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.f56843f);
        writableMapCreateMap.putInt("queued", this.f56838a.size());
        synchronized (this.f56840c) {
            try {
                for (Map.Entry entry : this.f56840c.entrySet()) {
                    writableMapCreateMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public void m(Boolean bool) {
        this.f56839b.post(new c(this, bool));
    }

    public void n(String str, Boolean bool) {
        synchronized (this.f56840c) {
            try {
                if (this.f56840c.containsKey(str)) {
                    int iIntValue = ((Integer) this.f56840c.get(str)).intValue();
                    if (iIntValue <= 1 || bool.booleanValue()) {
                        this.f56840c.remove(str);
                    } else {
                        this.f56840c.put(str, Integer.valueOf(iIntValue - 1));
                    }
                    int i10 = this.f56843f;
                    if (!bool.booleanValue()) {
                        iIntValue = 1;
                    }
                    this.f56843f = i10 - iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(a aVar) {
        this.f56839b.post(new f(this, aVar));
    }
}
