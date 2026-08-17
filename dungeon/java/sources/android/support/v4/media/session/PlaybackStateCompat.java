package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f19831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f19832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f19833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f19834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f19835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f19836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f19837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f19838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List f19839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f19840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f19841k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f19843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f19845d;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f19842a = parcel.readString();
            this.f19843b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f19844c = parcel.readInt();
            this.f19845d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f19843b) + ", mIcon=" + this.f19844c + ", mExtras=" + this.f19845d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f19842a);
            TextUtils.writeToParcel(this.f19843b, parcel, i10);
            parcel.writeInt(this.f19844c);
            parcel.writeBundle(this.f19845d);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f19831a = parcel.readInt();
        this.f19832b = parcel.readLong();
        this.f19834d = parcel.readFloat();
        this.f19838h = parcel.readLong();
        this.f19833c = parcel.readLong();
        this.f19835e = parcel.readLong();
        this.f19837g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f19839i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f19840j = parcel.readLong();
        this.f19841k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f19836f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f19831a + ", position=" + this.f19832b + ", buffered position=" + this.f19833c + ", speed=" + this.f19834d + ", updated=" + this.f19838h + ", actions=" + this.f19835e + ", error code=" + this.f19836f + ", error message=" + this.f19837g + ", custom actions=" + this.f19839i + ", active item id=" + this.f19840j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19831a);
        parcel.writeLong(this.f19832b);
        parcel.writeFloat(this.f19834d);
        parcel.writeLong(this.f19838h);
        parcel.writeLong(this.f19833c);
        parcel.writeLong(this.f19835e);
        TextUtils.writeToParcel(this.f19837g, parcel, i10);
        parcel.writeTypedList(this.f19839i);
        parcel.writeLong(this.f19840j);
        parcel.writeBundle(this.f19841k);
        parcel.writeInt(this.f19836f);
    }
}
