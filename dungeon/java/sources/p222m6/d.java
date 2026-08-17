package p222m6;

import W4.a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49142a = new d();

    private d() {
    }

    public static final int a(InputStream inputStream) {
        if (inputStream == null) {
            a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new androidx.exifinterface.media.a(inputStream).c("Orientation", 1);
        } catch (IOException e10) {
            a.g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            return 0;
        }
    }
}
