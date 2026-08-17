package I;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class K0 extends R1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4500d = new b(null);

    @NotNull
    public static final Parcelable.Creator<K0> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public K0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            S1 s1H;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                s1H = T1.h();
            } else if (i10 == 1) {
                s1H = T1.m();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                s1H = T1.k();
            }
            return new K0(value, s1H);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K0[] newArray(int i10) {
            return new K0[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public K0(Object obj, S1 s10) {
        super(obj, s10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        S1 s1L = l();
        if (Intrinsics.b(s1L, T1.h())) {
            i11 = 0;
        } else if (Intrinsics.b(s1L, T1.m())) {
            i11 = 1;
        } else {
            if (!Intrinsics.b(s1L, T1.k())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
