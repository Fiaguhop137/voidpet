package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnapshotMetadataEntity f32168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SnapshotContentsEntity f32169b;

    public SnapshotEntity(c cVar, SnapshotContentsEntity snapshotContentsEntity) {
        this.f32168a = new SnapshotMetadataEntity(cVar);
        this.f32169b = snapshotContentsEntity;
    }

    @Override // com.google.android.gms.games.snapshot.a
    public b U3() {
        SnapshotContentsEntity snapshotContentsEntity = this.f32169b;
        if (snapshotContentsEntity.isClosed()) {
            return null;
        }
        return snapshotContentsEntity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return AbstractC3851p.a(aVar.getMetadata(), getMetadata()) && AbstractC3851p.a(aVar.U3(), U3());
    }

    @Override // com.google.android.gms.games.snapshot.a
    public c getMetadata() {
        return this.f32168a;
    }

    public int hashCode() {
        return AbstractC3851p.b(getMetadata(), U3());
    }

    public String toString() {
        return AbstractC3851p.c(this).a("Metadata", getMetadata()).a("HasContents", Boolean.valueOf(U3() != null)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, getMetadata(), i10, false);
        p188k8.c.t(parcel, 3, U3(), i10, false);
        p188k8.c.b(parcel, iA);
    }
}
