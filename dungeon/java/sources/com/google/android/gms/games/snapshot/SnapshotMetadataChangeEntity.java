package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import p170j8.r;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataChangeEntity extends p {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f32171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f32172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitmapTeleporter f32173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f32174e;

    SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f32170a = str;
        this.f32171b = l10;
        this.f32173d = bitmapTeleporter;
        this.f32172c = uri;
        this.f32174e = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        r.p(z10, "Cannot set both a URI and an image");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32170a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.s(parcel, 2, this.f32171b, false);
        p188k8.c.t(parcel, 4, this.f32172c, i10, false);
        p188k8.c.t(parcel, 5, this.f32173d, i10, false);
        p188k8.c.s(parcel, 6, this.f32174e, false);
        p188k8.c.b(parcel, iA);
    }
}
