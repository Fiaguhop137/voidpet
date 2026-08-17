package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31848a = Collections.synchronizedMap(new C4101a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31849b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f31850c;

    m0() {
    }

    final AbstractC2317j a(String str, Class cls) {
        return (AbstractC2317j) cls.cast(this.f31848a.get(str));
    }

    final void b(String str, AbstractC2317j abstractC2317j) {
        Map map = this.f31848a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, abstractC2317j);
        if (this.f31849b > 0) {
            new K8.p(Looper.getMainLooper()).post(new l0(this, abstractC2317j, str));
        }
    }

    final void c(Bundle bundle) {
        this.f31849b = 1;
        this.f31850c = bundle;
        for (Map.Entry entry : this.f31848a.entrySet()) {
            ((AbstractC2317j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void d() {
        this.f31849b = 2;
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).onStart();
        }
    }

    final void e() {
        this.f31849b = 3;
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).onResume();
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f31848a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC2317j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f31849b = 4;
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).onStop();
        }
    }

    final void i() {
        this.f31849b = 5;
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).onDestroy();
        }
    }

    final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f31848a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2317j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int k() {
        return this.f31849b;
    }

    final /* synthetic */ Bundle l() {
        return this.f31850c;
    }
}
