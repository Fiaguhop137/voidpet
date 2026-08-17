package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK {
    private StringBuilder getRevenue = new StringBuilder();
    private final List<AFa1zSDK> getCurrencyIso4217Code = new ArrayList();
    private final String getMonetizationNetwork = null;

    enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1zSDK getCurrencyIso4217Code() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        List<AFa1zSDK> list = this.getCurrencyIso4217Code;
        return list.get(list.size() - 1);
    }

    private void getMediationNetwork() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            return;
        }
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            List<AFa1zSDK> list = this.getCurrencyIso4217Code;
            list.set(list.size() - 1, aFa1zSDK);
        } else {
            if (currencyIso4217Code == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getRevenue.append(',');
                return;
            }
            if (currencyIso4217Code != AFa1zSDK.DANGLING_KEY) {
                if (currencyIso4217Code != AFa1zSDK.NULL) {
                    throw new AFg1mSDK("Nesting problem");
                }
            } else {
                this.getRevenue.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                List<AFa1zSDK> list2 = this.getCurrencyIso4217Code;
                list2.set(list2.size() - 1, aFa1zSDK2);
            }
        }
    }

    final void AFAdRevenueData(String str) {
        this.getRevenue.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.getRevenue.append("\\f");
            } else if (cCharAt == '\r') {
                this.getRevenue.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getRevenue.append("\\b");
                        break;
                    case '\t':
                        this.getRevenue.append("\\t");
                        break;
                    case '\n':
                        this.getRevenue.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getRevenue.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getRevenue.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getRevenue;
                sb2.append('\\');
                sb2.append(cCharAt);
            }
        }
        this.getRevenue.append("\"");
    }

    public final AFg1dSDK getCurrencyIso4217Code(Object obj) throws Throwable {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 324, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1hSDK.f28450d;
                Object declaredMethod = map.get(-811011778);
                if (declaredMethod == null) {
                    declaredMethod = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 322, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
                    map.put(-811011778, declaredMethod);
                }
                ((Method) declaredMethod).invoke(obj, objArr);
                return this;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof AFg1gSDK) {
            ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
            return this;
        }
        getMediationNetwork();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
            this.getRevenue.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getRevenue.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
            return this;
        }
        AFAdRevenueData(obj.toString());
        return this;
    }

    public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty() && this.getRevenue.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.getCurrencyIso4217Code.add(aFa1zSDK);
        this.getRevenue.append(str);
        return this;
    }

    public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code != aFa1zSDK2 && currencyIso4217Code != aFa1zSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        List<AFa1zSDK> list = this.getCurrencyIso4217Code;
        list.remove(list.size() - 1);
        this.getRevenue.append(str);
        return this;
    }

    final void getMonetizationNetwork() throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getRevenue.append(',');
        } else if (currencyIso4217Code != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        List<AFa1zSDK> list = this.getCurrencyIso4217Code;
        list.set(list.size() - 1, aFa1zSDK);
    }

    public final String toString() {
        if (this.getRevenue.length() == 0) {
            return null;
        }
        return this.getRevenue.toString();
    }
}
