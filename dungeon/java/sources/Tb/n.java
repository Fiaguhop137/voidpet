package Tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f12433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f12434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f12435c;

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12433a = sharedPreferences;
        this.f12434b = new Bundle();
        this.f12435c = Ad.j.b(new m(this));
    }

    private final Bundle g() {
        return (Bundle) this.f12435c.getValue();
    }

    private final Bundle j() {
        String string;
        Bundle bundleD;
        Bundle bundle = new Bundle();
        if (this.f12433a.getLong("expire", 0L) > new Date().getTime() && (string = this.f12433a.getString("bundle", null)) != null && (bundleD = o.d(string)) != null) {
            bundle = bundleD;
        }
        this.f12433a.edit().clear().apply();
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle o(n nVar) {
        return nVar.j();
    }

    public final n b(String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12434b.putBundle(key, value);
        return this;
    }

    public final n c(String key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12434b.putSerializable(key, value);
        return this;
    }

    public final n d(String key, ArrayList value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12434b.putStringArrayList(key, value);
        return this;
    }

    public final n e(String key, Map value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Bundle bundle = this.f12434b;
        Pair[] pairArr = (Pair[]) N.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final n f(String key, Map value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Bundle bundle = this.f12434b;
        Pair[] pairArr = (Pair[]) N.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void h() {
        SharedPreferences.Editor editorEdit = this.f12433a.edit();
        editorEdit.putString("bundle", o.c(this.f12434b));
        editorEdit.putLong("expire", new Date().getTime() + 300000);
        editorEdit.commit();
    }

    public final Bundle i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().getBundle(key);
    }

    public final Serializable k(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleG = g();
        return Build.VERSION.SDK_INT >= 33 ? bundleG.getSerializable(key, Serializable.class) : bundleG.getSerializable(key);
    }

    public final ArrayList l(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().getStringArrayList(key);
    }

    public final Map m(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.c(setKeySet);
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.e(N.e(CollectionsKt.w(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, Integer.valueOf(bundle.getInt((String) obj)));
        }
        return linkedHashMap;
    }

    public final Map n(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.e(N.e(CollectionsKt.w(set, 10)), 16));
        for (Object obj : set) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                throw new IllegalStateException("For a key '" + str + "' there should be a serializable class available");
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
