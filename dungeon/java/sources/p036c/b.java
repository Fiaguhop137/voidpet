package p036c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f26651a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f26652b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p036c.a f26653c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0352b extends p036c.a.AbstractBinderC0350a {
        BinderC0352b() {
        }

        @Override // p036c.a
        public void f0(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f26652b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.f(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f26655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f26656b;

        c(int i10, Bundle bundle) {
            this.f26655a = i10;
            this.f26656b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f(this.f26655a, this.f26656b);
        }
    }

    b(Parcel parcel) {
        this.f26653c = p036c.a.AbstractBinderC0350a.g(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void f(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f26653c == null) {
                    this.f26653c = new BinderC0352b();
                }
                parcel.writeStrongBinder(this.f26653c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
