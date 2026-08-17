package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class v extends io.invertase.firebase.common.b {
    v(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void n(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).c(str, bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void o() {
        FirebaseAnalytics.getInstance(a()).d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void p(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).e(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void q(Bundle bundle) {
        boolean z10 = bundle.getBoolean("analytics_storage");
        boolean z11 = bundle.getBoolean("ad_storage");
        boolean z12 = bundle.getBoolean("ad_user_data");
        boolean z13 = bundle.getBoolean("ad_personalization");
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, z10 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_STORAGE, z11 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_USER_DATA, z12 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, z13 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        FirebaseAnalytics.getInstance(a()).f(enumMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void r(Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).g(bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void s(long j10) {
        FirebaseAnalytics.getInstance(a()).h(j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void t(String str) {
        FirebaseAnalytics.getInstance(a()).i(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : setKeySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void v(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).j(str, str2);
        return null;
    }

    Task A(Bundle bundle) {
        return Tasks.call(new t(this, bundle));
    }

    Task B(long j10) {
        return Tasks.call(new u(this, j10));
    }

    Task C(String str) {
        return Tasks.call(new q(this, str));
    }

    Task D(Bundle bundle) {
        return Tasks.call(new m(this, bundle));
    }

    Task E(String str, String str2) {
        return Tasks.call(new s(this, str, str2));
    }

    Task l() {
        return FirebaseAnalytics.getInstance(a()).a();
    }

    Task m() {
        return FirebaseAnalytics.getInstance(a()).b();
    }

    Task w(String str, Bundle bundle) {
        return Tasks.call(new r(this, str, bundle));
    }

    Task x() {
        return Tasks.call(new n(this));
    }

    Task y(Boolean bool) {
        return Tasks.call(new p(this, bool));
    }

    Task z(Bundle bundle) {
        return Tasks.call(new o(this, bundle));
    }
}
