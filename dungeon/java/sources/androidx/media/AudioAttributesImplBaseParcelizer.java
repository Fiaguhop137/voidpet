package androidx.media;

import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f24416a = aVar.p(audioAttributesImplBase.f24416a, 1);
        audioAttributesImplBase.f24417b = aVar.p(audioAttributesImplBase.f24417b, 2);
        audioAttributesImplBase.f24418c = aVar.p(audioAttributesImplBase.f24418c, 3);
        audioAttributesImplBase.f24419d = aVar.p(audioAttributesImplBase.f24419d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f24416a, 1);
        aVar.F(audioAttributesImplBase.f24417b, 2);
        aVar.F(audioAttributesImplBase.f24418c, 3);
        aVar.F(audioAttributesImplBase.f24419d, 4);
    }
}
