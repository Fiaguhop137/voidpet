package com.rivereactnative;

import app.rive.runtime.kotlin.core.ViewModelInstance;
import kotlin.jvm.internal.Intrinsics;
import p088ef.B0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewModelInstance f38663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0 f38666d;

    public b(ViewModelInstance instance, String path, String propertyType, B0 job) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(propertyType, "propertyType");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f38663a = instance;
        this.f38664b = path;
        this.f38665c = propertyType;
        this.f38666d = job;
    }

    public final ViewModelInstance a() {
        return this.f38663a;
    }

    public final B0 b() {
        return this.f38666d;
    }

    public final String c() {
        return this.f38664b;
    }

    public final String d() {
        return this.f38665c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.b(this.f38663a, bVar.f38663a) && Intrinsics.b(this.f38664b, bVar.f38664b) && Intrinsics.b(this.f38665c, bVar.f38665c) && Intrinsics.b(this.f38666d, bVar.f38666d);
    }

    public int hashCode() {
        return (((((this.f38663a.hashCode() * 31) + this.f38664b.hashCode()) * 31) + this.f38665c.hashCode()) * 31) + this.f38666d.hashCode();
    }

    public String toString() {
        return "PropertyListener(instance=" + this.f38663a + ", path=" + this.f38664b + ", propertyType=" + this.f38665c + ", job=" + this.f38666d + ")";
    }
}
