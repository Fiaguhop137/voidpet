package com.facebook.react.runtime;

import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f30119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f30120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f30121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f30122d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    public interface InterfaceC0385a {
        Object get();
    }

    public enum b {
        Init,
        Creating,
        Success,
        Failure;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f30128f = Gd.a.a(e());
    }

    public a(Object obj) {
        this.f30119a = obj;
        this.f30120b = this.f30119a;
        this.f30121c = b.Init;
        this.f30122d = "";
    }

    public /* synthetic */ a(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f30119a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return obj;
    }

    public final synchronized Object b() {
        Object objA;
        objA = a();
        e();
        return objA;
    }

    public final synchronized Object c() {
        return this.f30119a;
    }

    public final Object d(InterfaceC0385a provider) {
        boolean z10;
        Object objA;
        Object objA2;
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this) {
            b bVar = this.f30121c;
            b bVar2 = b.Success;
            if (bVar == bVar2) {
                return a();
            }
            if (this.f30121c == b.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f30122d);
            }
            b bVar3 = this.f30121c;
            b bVar4 = b.Creating;
            boolean z11 = false;
            if (bVar3 != bVar4) {
                this.f30121c = bVar4;
                z10 = true;
            } else {
                z10 = false;
            }
            Unit unit = Unit.f48228a;
            if (z10) {
                try {
                    this.f30119a = provider.get();
                    synchronized (this) {
                        this.f30121c = bVar2;
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        objA = a();
                    }
                    return objA;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.f30121c = b.Failure;
                        this.f30122d = String.valueOf(e10.getMessage());
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        Unit unit2 = Unit.f48228a;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.f30121c == b.Creating) {
                    try {
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                if (this.f30121c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f30122d);
                }
                objA2 = a();
            }
            return objA2;
        }
    }

    public final synchronized void e() {
        this.f30119a = this.f30120b;
        this.f30121c = b.Init;
        this.f30122d = "";
    }
}
