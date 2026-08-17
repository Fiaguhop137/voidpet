package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2256h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f30500d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f30501a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f30502b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f30503c = new b();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Thread f30504a;

        public b() {
        }

        public final void a() {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.f30504a == null) {
                this.f30504a = threadCurrentThread;
            }
            p240n6.a.a(Intrinsics.b(this.f30504a, threadCurrentThread));
        }
    }

    static {
        p348t6.b.a("ShadowNodeRegistry", p348t6.a.ERROR);
    }

    public final void a(V node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f30503c.a();
        this.f30501a.put(node.M(), node);
    }

    public final void b(V node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f30503c.a();
        int iM = node.M();
        this.f30501a.put(iM, node);
        this.f30502b.put(iM, true);
    }

    public final V c(int i10) {
        this.f30503c.a();
        return (V) this.f30501a.get(i10);
    }

    public final int d() {
        this.f30503c.a();
        return this.f30502b.size();
    }

    public final int e(int i10) {
        this.f30503c.a();
        return this.f30502b.keyAt(i10);
    }

    public final boolean f(int i10) {
        this.f30503c.a();
        return this.f30502b.get(i10);
    }

    public final void g(int i10) {
        this.f30503c.a();
        if (!this.f30502b.get(i10)) {
            this.f30501a.remove(i10);
            return;
        }
        throw new C2275s("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public final void h(int i10) {
        this.f30503c.a();
        if (i10 == -1) {
            return;
        }
        if (this.f30502b.get(i10)) {
            this.f30501a.remove(i10);
            this.f30502b.delete(i10);
        } else {
            throw new C2275s("View with tag " + i10 + " is not registered as a root view");
        }
    }
}
