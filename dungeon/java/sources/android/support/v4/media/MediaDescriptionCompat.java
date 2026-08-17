package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f19796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f19797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f19798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f19799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f19800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f19801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f19802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f19803i;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.f(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f19805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f19806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f19807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f19808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f19809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f19810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f19811h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f19804a, this.f19805b, this.f19806c, this.f19807d, this.f19808e, this.f19809f, this.f19810g, this.f19811h);
        }

        public b b(CharSequence charSequence) {
            this.f19807d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f19810g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f19808e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f19809f = uri;
            return this;
        }

        public b f(String str) {
            this.f19804a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f19811h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f19806c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f19805b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f19795a = str;
        this.f19796b = charSequence;
        this.f19797c = charSequence2;
        this.f19798d = charSequence3;
        this.f19799e = bitmap;
        this.f19800f = uri;
        this.f19801g = bundle;
        this.f19802h = uri2;
    }

    public static MediaDescriptionCompat f(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f19803i = obj;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object j() {
        Object obj = this.f19803i;
        if (obj != null) {
            return obj;
        }
        Object objB = android.support.v4.media.a.C0249a.b();
        android.support.v4.media.a.C0249a.g(objB, this.f19795a);
        android.support.v4.media.a.C0249a.i(objB, this.f19796b);
        android.support.v4.media.a.C0249a.h(objB, this.f19797c);
        android.support.v4.media.a.C0249a.c(objB, this.f19798d);
        android.support.v4.media.a.C0249a.e(objB, this.f19799e);
        android.support.v4.media.a.C0249a.f(objB, this.f19800f);
        android.support.v4.media.a.C0249a.d(objB, this.f19801g);
        android.support.v4.media.b.a.a(objB, this.f19802h);
        Object objA = android.support.v4.media.a.C0249a.a(objB);
        this.f19803i = objA;
        return objA;
    }

    public String toString() {
        return ((Object) this.f19796b) + ", " + ((Object) this.f19797c) + ", " + ((Object) this.f19798d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(j(), parcel, i10);
    }
}
