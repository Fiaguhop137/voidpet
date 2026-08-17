package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotContentsEntity extends p implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p296q8.a f32167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32166b = new Object();

    @NonNull
    public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new d();

    public SnapshotContentsEntity(p296q8.a aVar) {
        this.f32167a = aVar;
    }

    public final boolean isClosed() {
        return this.f32167a == null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, this.f32167a, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
