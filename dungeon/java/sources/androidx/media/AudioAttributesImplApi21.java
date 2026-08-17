package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AudioAttributes f24414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24415b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f24414a.equals(((AudioAttributesImplApi21) obj).f24414a);
        }
        return false;
    }

    public int hashCode() {
        return this.f24414a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f24414a;
    }
}
