package p117g8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p188k8.a;
import p188k8.c;

/* JADX INFO: renamed from: g8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3429a extends a {

    @NonNull
    public static final Parcelable.Creator<C3429a> CREATOR = new C3432d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Intent f42189a;

    public C3429a(Intent intent) {
        this.f42189a = intent;
    }

    public Intent a4() {
        return this.f42189a;
    }

    public String b4() {
        String stringExtra = this.f42189a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f42189a.getStringExtra("message_id") : stringExtra;
    }

    final Integer c4() {
        if (this.f42189a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f42189a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.f42189a, i10, false);
        c.b(parcel, iA);
    }
}
