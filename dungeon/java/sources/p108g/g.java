package p108g;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f41932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f41933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f41931e = new c(null);

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f41936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f41937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41939d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f41936a = intentSender;
        }

        public final g a() {
            return new g(this.f41936a, this.f41937b, this.f41938c, this.f41939d);
        }

        public final a b(Intent intent) {
            this.f41937b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f41939d = i10;
            this.f41938c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f41932a = intentSender;
        this.f41933b = intent;
        this.f41934c = i10;
        this.f41935d = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.c(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent f() {
        return this.f41933b;
    }

    public final int j() {
        return this.f41934c;
    }

    public final int k() {
        return this.f41935d;
    }

    public final IntentSender l() {
        return this.f41932a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f41932a, i10);
        dest.writeParcelable(this.f41933b, i10);
        dest.writeInt(this.f41934c);
        dest.writeInt(this.f41935d);
    }
}
