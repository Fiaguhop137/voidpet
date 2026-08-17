package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p183k3.m;
import p183k3.n;
import p183k3.o;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.c f25398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f25399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f25400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.room.c.AbstractC0319c f25402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.room.b f25403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.room.a f25404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f25405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ServiceConnection f25406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f25407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f25408l;

    public static final class a extends androidx.room.c.AbstractC0319c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0319c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0319c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b bVarH = d.this.h();
                if (bVarH != null) {
                    bVarH.a0(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends androidx.room.a.AbstractBinderC0316a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(d this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void s(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            d.this.d().execute(new o(d.this, tables));
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            d.this.m(androidx.room.b.a.g(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f25397a = name;
        this.f25398b = invalidationTracker;
        this.f25399c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f25400d = applicationContext;
        this.f25404h = new b();
        this.f25405i = new AtomicBoolean(false);
        c cVar = new c();
        this.f25406j = cVar;
        this.f25407k = new m(this);
        this.f25408l = new n(this);
        l(new a((String[]) invalidationTracker.i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f25398b.n(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f25403g;
            if (bVar != null) {
                this$0.f25401e = bVar.v0(this$0.f25404h, this$0.f25397a);
                this$0.f25398b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f25401e;
    }

    public final Executor d() {
        return this.f25399c;
    }

    public final androidx.room.c e() {
        return this.f25398b;
    }

    public final androidx.room.c.AbstractC0319c f() {
        androidx.room.c.AbstractC0319c abstractC0319c = this.f25402f;
        if (abstractC0319c != null) {
            return abstractC0319c;
        }
        Intrinsics.r("observer");
        return null;
    }

    public final Runnable g() {
        return this.f25408l;
    }

    public final androidx.room.b h() {
        return this.f25403g;
    }

    public final Runnable i() {
        return this.f25407k;
    }

    public final AtomicBoolean j() {
        return this.f25405i;
    }

    public final void l(androidx.room.c.AbstractC0319c abstractC0319c) {
        Intrinsics.checkNotNullParameter(abstractC0319c, "<set-?>");
        this.f25402f = abstractC0319c;
    }

    public final void m(androidx.room.b bVar) {
        this.f25403g = bVar;
    }
}
