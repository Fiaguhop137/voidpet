package com.swmansion.gesturehandler.react;

import Ia.AbstractC1098d;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Ia.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f38885a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f38886b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f38887c = new SparseArray();

    private final synchronized void d(AbstractC1098d abstractC1098d) {
        try {
            Integer num = (Integer) this.f38886b.get(abstractC1098d.T());
            if (num != null) {
                this.f38886b.remove(abstractC1098d.T());
                ArrayList arrayList = (ArrayList) this.f38887c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(abstractC1098d);
                    }
                    if (arrayList.size() == 0) {
                        this.f38887c.remove(num.intValue());
                    }
                }
            }
            if (abstractC1098d.W() != null) {
                UiThreadUtil.runOnUiThread(new h(abstractC1098d));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC1098d abstractC1098d) {
        abstractC1098d.q();
    }

    private final synchronized void k(int i10, AbstractC1098d abstractC1098d) {
        try {
            if (this.f38886b.get(abstractC1098d.T()) != null) {
                throw new IllegalStateException(("Handler " + abstractC1098d + " already attached").toString());
            }
            this.f38886b.put(abstractC1098d.T(), Integer.valueOf(i10));
            Object obj = this.f38887c.get(i10);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC1098d);
                this.f38887c.put(i10, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(abstractC1098d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Ia.j
    public synchronized ArrayList a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        AbstractC1098d abstractC1098d = (AbstractC1098d) this.f38885a.get(i10);
        if (abstractC1098d != null) {
            d(abstractC1098d);
            abstractC1098d.u0(i12);
            k(i11, abstractC1098d);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void f() {
        this.f38885a.clear();
        this.f38886b.clear();
        this.f38887c.clear();
    }

    public final synchronized void g(int i10) {
        AbstractC1098d abstractC1098d = (AbstractC1098d) this.f38885a.get(i10);
        if (abstractC1098d != null) {
            d(abstractC1098d);
            this.f38885a.remove(i10);
        }
    }

    public final synchronized AbstractC1098d h(int i10) {
        return (AbstractC1098d) this.f38885a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f38887c.get(i10);
    }

    public final synchronized void j(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f38885a.put(handler.T(), handler);
    }
}
