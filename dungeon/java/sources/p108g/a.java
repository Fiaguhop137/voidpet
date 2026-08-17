package p108g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f41907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f41905c = new b(null);

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0480a();

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    public static final class C0480a implements Parcelable.Creator {
        C0480a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel);
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

        public final String a(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }
    }

    public a(int i10, Intent intent) {
        this.f41906a = i10;
        this.f41907b = intent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent f() {
        return this.f41907b;
    }

    public final int j() {
        return this.f41906a;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f41905c.a(this.f41906a) + ", data=" + this.f41907b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f41906a);
        dest.writeInt(this.f41907b == null ? 0 : 1);
        Intent intent = this.f41907b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }
}
