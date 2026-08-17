package com.appsflyer.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1bSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1bSDK$5, reason: invalid class name */
    final class AnonymousClass5 implements InvocationHandler {
        private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
        private /* synthetic */ Class getMonetizationNetwork;

        AnonymousClass5(Class cls, AFa1uSDK aFa1uSDK) {
            this.getMonetizationNetwork = cls;
            this.getCurrencyIso4217Code = aFa1uSDK;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String string;
            String string2;
            String string3;
            Bundle bundle;
            if (!method.getName().equals("onDeferredAppLinkDataFetched")) {
                AFa1uSDK aFa1uSDK = this.getCurrencyIso4217Code;
                if (aFa1uSDK != null) {
                    aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                }
                return null;
            }
            Object obj2 = objArr[0];
            if (obj2 != null) {
                Bundle bundle2 = (Bundle) Bundle.class.cast(this.getMonetizationNetwork.getMethod("getArgumentBundle", null).invoke(this.getMonetizationNetwork.cast(obj2), null));
                if (bundle2 != null) {
                    string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                    string3 = bundle2.getString("target_url");
                    Bundle bundle3 = bundle2.getBundle("extras");
                    string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                } else {
                    string = null;
                    string2 = null;
                    string3 = null;
                }
                AFa1uSDK aFa1uSDK2 = this.getCurrencyIso4217Code;
                if (aFa1uSDK2 != null) {
                    aFa1uSDK2.getRevenue(string2, string3, string);
                }
            } else {
                AFa1uSDK aFa1uSDK3 = this.getCurrencyIso4217Code;
                if (aFa1uSDK3 != null) {
                    aFa1uSDK3.getRevenue(null, null, null);
                }
            }
            return null;
        }
    }

    public interface AFa1uSDK {
        void getRevenue(String str);

        void getRevenue(String str, String str2, String str3);
    }
}
