package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1pSDK implements AFj1lSDK {
    private static final BitSet component2;
    boolean AFAdRevenueData;
    private final Map<AFj1nSDK, AFj1nSDK> areAllFieldsValid;
    private final SensorManager component1;
    private final Map<AFj1nSDK, Map<String, Object>> component3;
    private final ExecutorService component4;
    private boolean copy;
    private final Runnable equals;
    final Runnable getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Object getMonetizationNetwork;
    final Handler getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1pSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                AFj1pSDK.this.getRevenue();
                AFj1pSDK aFj1pSDK = AFj1pSDK.this;
                aFj1pSDK.getRevenue.postDelayed(aFj1pSDK.getCurrencyIso4217Code, 150L);
                AFj1pSDK.this.AFAdRevenueData = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1pSDK$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                try {
                    AFj1pSDK aFj1pSDK = AFj1pSDK.this;
                    if (aFj1pSDK.AFAdRevenueData) {
                        aFj1pSDK.getRevenue.removeCallbacks(aFj1pSDK.getMediationNetwork);
                        AFj1pSDK aFj1pSDK2 = AFj1pSDK.this;
                        aFj1pSDK2.getRevenue.removeCallbacks(aFj1pSDK2.getCurrencyIso4217Code);
                        AFj1pSDK.this.getCurrencyIso4217Code();
                        AFj1pSDK.this.AFAdRevenueData = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        component2 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    public AFj1pSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }

    private AFj1pSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMonetizationNetwork = new Object();
        BitSet bitSet = component2;
        this.areAllFieldsValid = new HashMap(bitSet.size());
        this.component3 = new ConcurrentHashMap(bitSet.size());
        this.getMediationNetwork = new AnonymousClass2();
        this.getCurrencyIso4217Code = new C(this);
        this.equals = new AnonymousClass5();
        this.component1 = sensorManager;
        this.getRevenue = handler;
        this.component4 = executorService;
    }

    @NonNull
    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getMonetizationNetwork) {
            try {
                if (!this.areAllFieldsValid.isEmpty() && this.copy) {
                    Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFAdRevenueData(this.component3, false);
                    }
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    private List<Map<String, Object>> component1() {
        synchronized (this.getMonetizationNetwork) {
            try {
                Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
                while (it.hasNext()) {
                    it.next().AFAdRevenueData(this.component3, true);
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getCurrencyIso4217Code(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component4);
                    if (!this.areAllFieldsValid.containsKey(aFj1nSDK)) {
                        this.areAllFieldsValid.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component1.registerListener(this.areAllFieldsValid.get(aFj1nSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.copy = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        synchronized (this.getMonetizationNetwork) {
            this.getRevenue.post(new B(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        try {
            if (!this.areAllFieldsValid.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.areAllFieldsValid.values()) {
                    this.component1.unregisterListener(aFj1nSDK);
                    aFj1nSDK.AFAdRevenueData(this.component3, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.copy = false;
    }

    private static boolean getCurrencyIso4217Code(int i10) {
        return i10 >= 0 && component2.get(i10);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final void AFAdRevenueData() {
        this.getRevenue.post(this.equals);
        this.getRevenue.post(this.getMediationNetwork);
    }

    final void getCurrencyIso4217Code() {
        this.getRevenue.post(new B(this));
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    @NonNull
    public final Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (!listAreAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent1 = component1();
        if (!listComponent1.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent1);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final synchronized void getMonetizationNetwork() {
        this.getRevenue.post(this.equals);
    }

    final void getRevenue() {
        this.getRevenue.post(new D(this));
    }
}
