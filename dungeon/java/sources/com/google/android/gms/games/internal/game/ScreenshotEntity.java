package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;
import p188k8.c;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ScreenshotEntity extends p implements p153i8.a, Parcelable {

    @NonNull
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new p440y8.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f32080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32082c;

    public ScreenshotEntity(Uri uri, int i10, int i11) {
        this.f32080a = uri;
        this.f32081b = i10;
        this.f32082c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return AbstractC3851p.a(screenshotEntity.f32080a, this.f32080a) && AbstractC3851p.a(Integer.valueOf(screenshotEntity.f32081b), Integer.valueOf(this.f32081b)) && AbstractC3851p.a(Integer.valueOf(screenshotEntity.f32082c), Integer.valueOf(this.f32082c));
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f32080a, Integer.valueOf(this.f32081b), Integer.valueOf(this.f32082c));
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("Uri", this.f32080a).a("Width", Integer.valueOf(this.f32081b)).a("Height", Integer.valueOf(this.f32082c)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Uri uri = this.f32080a;
        int iA = c.a(parcel);
        c.t(parcel, 1, uri, i10, false);
        c.n(parcel, 2, this.f32081b);
        c.n(parcel, 3, this.f32082c);
        c.b(parcel, iA);
    }
}
