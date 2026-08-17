package Jc;

import Ad.v;
import Hc.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p128h1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5801b = new b(null);

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0112a();

    /* JADX INFO: renamed from: Jc.a$a, reason: collision with other inner class name */
    public static final class C0112a implements Parcelable.Creator {
        C0112a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private a(Parcel parcel) {
        T t10 = (T) parcel.readParcelable(a.class.getClassLoader());
        if (t10 == null) {
            throw new IllegalArgumentException("RemoteMessage from readParcelable must not be null");
        }
        this(t10);
    }

    public /* synthetic */ a(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public a(T remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        this.f5802a = remoteMessage;
    }

    @Override // Hc.d
    public String W2() {
        String strD;
        T.b bVarG4 = this.f5802a.g4();
        if (bVarG4 == null || (strD = bVarG4.d()) == null) {
            strD = (String) this.f5802a.b4().get("channelId");
        }
        return strD == null ? d.a.a(this) : strD;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Hc.d
    public Bundle e2() {
        return c.a(v.a("type", "push"), v.a("remoteMessage", p408wc.d.b(this.f5802a)));
    }

    public final T f() {
        return this.f5802a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f5802a, 0);
    }
}
